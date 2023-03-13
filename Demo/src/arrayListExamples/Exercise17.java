package arrayListExamples;

import java.util.ArrayList;

public class Exercise17 {
	
	public static void main(String[] args) {
		
		ArrayList<String> lista1 = new ArrayList<>();
		
		lista1.add("Red");
		lista1.add("Green");
		lista1.add("Black");
		lista1.add("White");
		lista1.add("Pink");
		
		System.out.println("Originalna niza: " + lista1);
		
		lista1.removeAll(lista1);
		System.out.println("Nizata otkako gi izvadivme site elementi" +lista1);
		
	}

}
