package arrayExamples;

import java.util.Arrays;

public class Exercise8 {
	
	public static void main(String[] args) {
		
		Integer niza[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		Integer copyNiza[] = new Integer[10];
		
		System.out.println("Originalna niza : "+Arrays.toString(niza));
		
		
		Integer i = 0;
		for(i=0; i < niza.length; i++) {
			copyNiza[i] = niza[i];
			
		}
		System.out.println("Nova niza: "+Arrays.toString(copyNiza));
		
	}
	

}
