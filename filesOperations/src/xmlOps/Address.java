package xmlOps;

public class Address {
	
	//Address (street, number, city)
	private String street;
	private Integer number;
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(int i) {
		this.number = i;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String street, Integer number, String city) {
		super();
		this.street = street;
		this.number = number;
		this.city = city;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + ", city=" + city + "]";
	}
	
	
	
	}


