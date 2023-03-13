package arrayListExamples;

import java.util.ArrayList;

public class Exercise19 {
	
	public static void main(String[] args) {
		
		ArrayList<String> lista1 = new ArrayList<>();
		
		lista1.add("Red");
		lista1.add("Green");
		lista1.add("Black");
		lista1.add("White");
		lista1.add("Pink");
		lista1.add("Yellow");
		
		System.out.println("Originalna niza: " +lista1);
		
		lista1.trimToSize();
		System.out.println(lista1);
	}

}
