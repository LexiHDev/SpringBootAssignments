package net.genspark.restfulAPI.Controllers;

import net.genspark.restfulAPI.Entities.Employee;
import net.genspark.restfulAPI.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public @RestController
class Controller
{
	private @Autowired
	EmployeeService employeeService;
	
	@GetMapping("/")
	public String index() {
		return "<HTML><h1>Welcome to the index of my project.</h1></HTML>";
	}
	
	@GetMapping("/Employees")
	public List<Employee> getAllEmployees() {
		return this.employeeService.getAllEmployees();
	}
	
	@GetMapping("/Employees/{id}")
	public Employee getEmployee(@PathVariable long id) {
		return this.employeeService.getEmployeeById(id);
	}
	
	@PostMapping("/Employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employeeService.addEmployee(employee);
	}
	
	@PutMapping("/Employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeService.changeEmployee(employee);
	}
	
	@DeleteMapping("/Employees/{id}")
	public boolean deleteEmployee(@PathVariable long id) {
		return this.employeeService.deleteEmployee(id);
	}
	
}
