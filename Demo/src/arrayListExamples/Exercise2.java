package arrayListExamples;

import java.util.ArrayList;


public class Exercise2 {
	
	public static void main(String[] args) {
		
	ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Orange");
		colors.add("White");
		colors.add("Black");
		
		System.out.println("Niza: " + colors );
		
		for (String boja : colors) {
			
			System.out.println("Color: " + boja);
			
		}
	}
	
	


}
