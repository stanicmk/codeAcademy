package arrayListExamples;

import java.util.ArrayList;

public class Exercise1 {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Orange");
		colors.add("White");
		colors.add("Black");
		
		//override (add new element, br 2 e index)
		colors.add(2, "Purple");
		
		
		System.out.println("Colors:" + colors);
		
		
	}
	
}
