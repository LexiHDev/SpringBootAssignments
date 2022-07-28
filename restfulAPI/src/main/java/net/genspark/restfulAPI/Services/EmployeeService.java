package net.genspark.restfulAPI.Services;

import net.genspark.restfulAPI.Entities.Employee;

import java.util.List;

public interface EmployeeService
{
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee changeEmployee(Employee employee);
	Employee addEmployee(Employee employee);
	boolean deleteEmployee(long name);
}
