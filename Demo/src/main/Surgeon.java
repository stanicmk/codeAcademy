package main;

public class Surgeon {

	String workathospital;
	String treatPatient;
	
	public String getInfo() {
		return " Surgeon workathospital: " + workathospital + " Surgeon treatPatient: " + treatPatient;
		
	} public static void main(String[] args) {
		
		Surgeon surgeonObj = new Surgeon();
		
		surgeonObj.workathospital = "Osmi Septemvri";
		surgeonObj.treatPatient = "Incision";
		
		System.out.println(surgeonObj.getInfo());
		
		
		
		
			
	}
	}
		
	
		