package arrayExamples;

public class Exercise15 {

	public static void main(String[] args) {

		String name = "Goran Stanic";
		
		printInitilas(name);
				

	}
	//since toUpper() returns int, we do typecasting
	private static void printInitilas(String name) {
		if(name.length() == 0)
			return;
		
		System.out.print(Character.toUpperCase(name.charAt(0)));
	
		
		//Traverse rest of the string
		//print the characters after space
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i) == ' ')
				System.out.print(" " + Character.toUpperCase(name.charAt(i + 1)));
			
		}
	}

}
