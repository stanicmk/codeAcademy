package arrayListExamples;

import java.util.ArrayList;

public class Exercise16 {
	
	private static ArrayList<String> lista1;

	public static void main(String[] args) {
		
		ArrayList<String> lista1 = new ArrayList<>();
		ArrayList<String> result = new ArrayList<>();
	
		
		lista1.add("Orange");
		lista1.add("Blue");
		lista1.add("Red");
		lista1.add("White");
		lista1.add("Black");
		
		result = (ArrayList<String>) lista1.clone();
		
		lista1.add("Yellow");
		
		
		lista1.remove(lista1.indexOf("Black"));
		
		
		
		System.out.println("Result: " + result);
		//Exercise17
		lista1.removeAll(lista1);
		
	}

}
