package arrayExamples;

import java.util.Arrays;

public class Exercise10 {
	
	static int max;
	static int min;
	
	
	public static void max_min(Integer[] mojaNiza) {
		
		max = mojaNiza[0];
		min = mojaNiza[0];
		int len = mojaNiza.length;
		
		for (int i = 1; i < len - 1; i= i + 2 ) {
			if (i + 1 > len) {
				if (mojaNiza[i] > max) max = mojaNiza[i];
				if (mojaNiza[i] < min) min = mojaNiza[i];
			}
			if (mojaNiza[i] > mojaNiza[i+1]) {
				if (mojaNiza[i] > max) max = mojaNiza[i];
				if (mojaNiza[1] < min) min = mojaNiza[i+1];
			}
			if (mojaNiza[i] < mojaNiza[i+1]) {
				if (mojaNiza[i] < min) min = mojaNiza[i];
				if (mojaNiza[i+1] > max) max = mojaNiza[i+1];
			}
		}
				
	}
		
		public static void main(String[] args) {
			
			Integer mojaNiza [] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
			max_min(mojaNiza);
			
			System.out.println("Originalna niza: " +Arrays.toString(mojaNiza));
			System.out.println("Maksimalna vrednost na nizata = " + max);
			System.out.println("Minimalna vrednost na nizata = " + min);
			
		
		
			
			
			
		}
		
	
		
		
		
		
		

}
