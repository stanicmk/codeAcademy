package arrayExamples;

public class Exercise4 {
	
	public static void main(String[] args) {
		
		Integer celiBroevi[] = {3, 4, 5, 7, 9};
		
		double rezultat = 0;
		
		for (int i = 0; i < celiBroevi.length; i++) {
		
			rezultat += celiBroevi[i];
		
		}
			
		double average = rezultat / celiBroevi.length;
			
		
		System.out.println("Prosecna vrednost e " + average);
		
		
		
		
	} 
	

}
