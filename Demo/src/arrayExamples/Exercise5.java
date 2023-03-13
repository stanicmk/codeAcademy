package arrayExamples;

public class Exercise5 {
	
	public static void main(String[] args) {
		Integer niza[] = {1789, 2305, 1899, 1456, 2013};
		
		System.out.println(contains(2305, niza));
		
	}
	
	public static Boolean contains(Integer number, Integer niza[]) {
		
		for (int i= 0; i< niza.length; i++) {
			
			System.out.println(niza[i]);
			
			if( number.equals(niza[i]) ) {
				
				System.out.println("Brojot go ima vo nizata");
				
				return true;
			}
		
			System.out.println("Brojot go nema vo nizata");
		
		}
		
		return false;
		
	
	
	}

}
