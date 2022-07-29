package net.genspark.restfulAPI.Services;

import net.genspark.restfulAPI.DAO.EmployeeDAO;
import net.genspark.restfulAPI.Entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public @Service
class EmployeeServiceImp implements EmployeeService
{
	@Autowired
	EmployeeDAO employeeDAO;
	
	@SuppressWarnings("unused") // called by springboot.
	@Override
	public List<Employee> getAllEmployees()
	{
		
		return employeeDAO.findAll();
	}
	
	public Employee getEmployeeById(long id)
	{
		return employeeDAO.findById(id).orElse(null);
	}
	
	
	@Override
	public Employee changeEmployee(Employee employee)
	{
		employeeDAO.saveAndFlush(employee);
		return employee;
	}
	
	@Override
	public Employee addEmployee(Employee employee)
	{
		return employeeDAO.save(employee);
	}
	
	@Override
	public boolean deleteEmployee(long id)
	{
		boolean exists = getEmployeeById(id) != null;
		if (exists)
		{
			employeeDAO.delete(getEmployeeById(id));
		}
		return exists;
	}
}
