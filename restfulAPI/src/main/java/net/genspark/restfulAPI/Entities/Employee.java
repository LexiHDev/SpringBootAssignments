package net.genspark.restfulAPI.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public @Entity @Table(name = "tbl_employees") class Employee
{
	private @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "Employee_ID") long id;
	private @Column(name="Employee_Name") String name;
	private @Column(name="Employee_Role") String role;
	private @Column(name="Employee_Salary") String salary;
	
	Employee() {};
	
	public Employee(long id, String name, String role, String salary) {
		this.name = name;
		this.id = id;
		this.role = role;
		this.salary = salary;
	}
	
	public long getId()
	{
		return id;
	}
	public String getSalary()
	{
		return salary;
	}
	public void setSalary(String salary)
	{
		this.salary = salary;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getRole()
	{
		return role;
	}
	public void setRole(String role)
	{
		this.role = role;
	}
	
	
}
