package arrayExamples;

import java.util.Arrays;

public class Exercise12 {
	
	public static void main(String[] args) {
		
		Integer mojaNiza[] = {1, 2, 5, 5, 6, 6, 7, 2};
		
		for (int i = 0; i < mojaNiza.length-1; i++) {
			
			for (int j = i+1; j < mojaNiza.length; j++) {
				
				if ((mojaNiza[i] == mojaNiza[j]) && (i !=j)) {
					
					System.out.println("Duplikati: " + mojaNiza[j]);
				}
			}
			
			
			
		}
		
		
	}

}
