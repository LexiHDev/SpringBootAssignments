package net.genspark.restfulAPI.Services;

import net.genspark.restfulAPI.Entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;

public @Service class EmployeeServiceImp implements EmployeeService
{
	List<Employee> employeeList;
	
	@SuppressWarnings("unused") // called by springboot.
	EmployeeServiceImp() {
		employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "Lexi Henson", "Sr. Dev", "200000"));
		employeeList.add(new Employee(2, "Bailey Henson", "Jr. Dev", "60000"));
	}
	@Override
	public List<Employee> getAllEmployees()
	{
		
		return employeeList;
	}
	
	public Employee getEmployeeById(long id)
	{
		return employeeList.stream().filter(employee -> Objects.equals(employee.getId(), id))
			.reduce((a, b) -> {
				throw new IllegalStateException("Multiple elements: " + a + ", " + b);
			})
			.orElse(null);
	}
	
	
	@Override
	public Employee changeEmployee(Employee employee)
	{
		employeeList = employeeList.stream()
			.map(employee1 -> {
				if (employee1.getId() == employee.getId())
				{
					return employee;
				}
				else return employee1;
			})
			.collect(Collectors.toList());
		return employee;
	}
	
	@Override
	public Employee addEmployee(Employee employee)
	{
		employeeList.add(employee);
		return employee;
	}
	@Override
	public boolean deleteEmployee(long id)
	{
		boolean exists = getEmployeeById(id) != null;
		try
		{
			employeeList = employeeList.stream()
				.filter(employee -> getEmployeeById(id) != employee)
				.collect(Collectors.toList());
		}
		catch (NoSuchElementException e) {
			System.out.printf("%s does not exist.", id);
		}
		return exists;
	}
}
