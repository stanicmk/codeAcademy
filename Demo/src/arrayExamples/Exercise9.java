package arrayExamples;

import java.util.Arrays;

public class Exercise9 {
	
	public static void main(String[] args) {
		
		Integer mojaNiza[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		
		//Vmetni element na 3 pozicija od nizata (index->2, value->5)
		
		int Index_pozicija = 2;
		int newValue = 5;
		
		System.out.println("Originalna niza: " +Arrays.toString(mojaNiza));
		
		for(int i=mojaNiza.length-1; i> Index_pozicija; i--) {
			mojaNiza[i] = mojaNiza[i-1];
		}
		mojaNiza[Index_pozicija] = newValue;
		
		System.out.println("Nova niza: " +Arrays.toString(mojaNiza));
	}

}
