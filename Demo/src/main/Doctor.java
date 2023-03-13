package main;

public class Doctor {

	String workathospital;
	String treatPatient;
	
	public String getInfo() {
		return " Doctor workathospital: " + workathospital + " Doctor treatPatient: " + treatPatient;
		
	}	
	
	public static void main(String[] args) {
		
	
		
		Doctor doctorObj = new Doctor();
		
		doctorObj.workathospital = "Osmi Septemvri";
		doctorObj.treatPatient = "treatPatient";
		
		System.out.println(doctorObj.getInfo());
		
		
				
	}
	
}
