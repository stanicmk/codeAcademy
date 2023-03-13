package arrayListExamples;

import java.util.ArrayList;

public class Exercise21 {
	
	public static void main(String[] args) {
		
		ArrayList<String> boja = new ArrayList<>();
		
		boja.add("Red");
		boja.add("Green");
		
		System.out.println("Originalna niza: " + boja);
		
		String new_boja = "White";
		boja.set(1, new_boja);
		
		int num=boja.size();
		
		System.out.println("Zameni go vtoriot element so 'White' .");
		
		for (int i = 0; i < num; i++) {
			
		System.out.println(boja.get(i));	
			
		}
		
		
	}

}
