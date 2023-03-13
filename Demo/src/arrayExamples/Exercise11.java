package arrayExamples;

import java.util.Arrays;

public class Exercise11 {
	
	
	public static void main(String[] args) {
		
		Integer mojaNiza1[] = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
		
		System.out.println("Originalna niza : " +Arrays.toString(mojaNiza1));
		
		int i = 0;
		
		for(i = 0; i < mojaNiza1.length / 2; i++) {
			
			int temp = mojaNiza1[i];
			mojaNiza1[i] = mojaNiza1[mojaNiza1.length - i - 1];
			mojaNiza1[mojaNiza1.length - i - 1] = temp;
			
		}
		
		System.out.println("Obratna niza: " +Arrays.toString(mojaNiza1));
		
		
	}
	
	
	
	
	
	
	
	

}
