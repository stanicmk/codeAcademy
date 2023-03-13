package constructorsToStringsExamples;

public class Doctor {
	
	String speciality;
	String name;
	String surname;
	
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
	public Doctor() {
		super();
	}
	
	
	
	public Doctor(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	
	
	public Doctor(String speciality, String name, String surname) {
		super();
		this.speciality = speciality;
		this.name = name;
		this.surname = surname;
	}
	
	
	@Override
	public String toString() {
		return "Doctor [speciality=" + speciality + ", name=" + name + ", surname=" + surname + "]";
	}
	
	
	

}
