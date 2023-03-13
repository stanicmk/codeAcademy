
package constructorsToStringsExamples;



public class Hospital {

	public static void main(String[] args) {
		
		
		
		
		Doctor newDoc = new Doctor();
		newDoc.setName("Zan");
		newDoc.setSurname("Mitrev");
		newDoc.setSpeciality("Cardiologyst");
		
		
		
		
				
		Surgeon newS = new Surgeon();
		newS.setName("Dimitar");
		newS.setSurname("Josifov");
		newS.setSpeciality("Neurologyst");
		
		System.out.println("Surgeon info: \nname: " + newS.getName() + "\nsurname: " +newS.getSurname() + "\nspeciality: " +newS.getSpeciality());
		
		System.out.println("=====================================================================");
		

		
		System.out.println("Doctor info: \nname: " + newDoc.getName() + "\nsurname: " +newDoc.getSurname() + "\nspeciality: " +newDoc.getSpeciality());
	
		Doctor dimitar = new Doctor("Cardiologyst", "Dimitar", "Josifov");
		
		System.out.println(dimitar.toString());
		
		
		
		
		//Arays
		
		//Doctor doktor [] = {new Doctor("Stomatolg", "Tom", "Johns"), new Doctor("Zan", "Mitrev"), new Doctor("Lee", "Cooper")};
		
		//for (Doctor doktor : doktori) {
			//System.out.println("ime i prezime " + doctor.getName() + " " + doctor.getSurname());
			
	
		
		
		
		
		
		
		
		
		//Surgeon hirurg = new 
		
	}
}
