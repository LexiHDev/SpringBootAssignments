import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig
{
	@Bean
	public Student student() {
		Address address = new Address();
		address.setCity("Tulsa");
		address.setCountry("USA");
		address.setState("Oklahoma");
		address.setZipcode("74008");
		
		Phone phone = new Phone();
		phone.setMob("618-625-8313");
		
		Student student = new Student();
		student.setName("Terra Henson");
		student.setAdd(address);
		student.setPh(List.of(phone));
		student.setId(3);
		return student;
	}
}
