package loopsExamples;

public class CelsiusToFarenheit {
	
	public static void main(String[] args) {
		
		System.out.println(celsiusToFarenheit(35));
		
		
		starLeft('*');
		
	}
	
	
	
	
	public static Double celsiusToFarenheit(Integer celsius) {
		
		Double f;
		
		f = (double) (celsius * 9/5 +32);
		
		return f;
	}
						//ako e tuka ()
	public static void starLeft(char c) {
		
		for (int i = 1; i < 6; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print(c); //moze i samo System.out.print("*")
			}
				
			System.out.println();
		}
	}
	

}
