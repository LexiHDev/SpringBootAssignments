import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student
{
	private int id;
	private String name;
	
	private List<Phone> ph;
	private Address add;
	
	@Override
	public String toString() {
		return "Student{" + "id='" + id + "', name=" + name + "', ph=" + ph + ", add=" + add + '}';
	}
	
	public Student() {
		System.out.println("WARNING: default constructor called.");
	}
	
	
	public List<Phone> getPh()
	{
		return ph;
	}
	public void setPh(List<Phone> ph)
	{
		this.ph = ph;
	}
	public Address getAdd()
	{
		return add;
	}
	public void setAdd(Address add)
	{
		this.add = add;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
}
