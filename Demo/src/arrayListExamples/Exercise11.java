package arrayListExamples;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise11 {
	
	public static void main(String[] args) {
		
ArrayList<String> colors = new ArrayList<>();
	
		
		colors.add("White");
		colors.add("Black");
		colors.add("Red");
		colors.add("Orange");
		
		System.out.println("Original array: " + colors);
		
Collections.reverse(colors);
		
		System.out.println("Reversed array: " + colors);
		
		
		
	}

}
