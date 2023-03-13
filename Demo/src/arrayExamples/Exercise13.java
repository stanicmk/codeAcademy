package arrayExamples;

import java.util.Arrays;

public class Exercise13 {
	
	public static void main(String[] args) {
		
		String mojaNiza[] = { "bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		
		for (int i = 0; i < mojaNiza.length - 1; i++) {
			
			for (int j = i+1; j < mojaNiza.length; j++) {
				
				if ( (mojaNiza[i].equals(mojaNiza[j])) && (i !=j)) {
					
					System.out.println("Duplikati: " + mojaNiza[j]);
			}
		}
	}
}

}
