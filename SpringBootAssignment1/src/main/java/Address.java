public class Address
{
	
	private String city;
	private String state;
	private String country;
	private String zipcode;
	
	public String getCity()
	{
		return city;
	}
	public String getCountry()
	{
		return country;
	}
	public String getState()
	{
		return state;
	}
	public String getZipcode()
	{
		return zipcode;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public void setZipcode(String zipcode)
	{
		this.zipcode = zipcode;
	}
	
	public Address(String city, String state, String country, String zipcode) {
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address{" +
			"city='" + city + '\'' +
			", state='" + state + '\'' +
			", country='" + country + '\'' +
			", zipcode='" + zipcode + '\'' +
			'}';
	}
}
