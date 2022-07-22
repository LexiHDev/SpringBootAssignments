import org.springframework.stereotype.Component;

@Component
public class Phone
{
	
	private String mob = "618-625-8313";
	
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	
	@Override
	public String toString()
	{
		return "Phone{" +
			"mob='" + mob + "'}";
	}
}
