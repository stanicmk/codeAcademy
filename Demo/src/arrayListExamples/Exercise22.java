package arrayListExamples;

import java.util.ArrayList;

public class Exercise22 {
	
	public static void main(String[] args) {
		
		ArrayList<String> lista1 = new ArrayList<>();
		
		lista1.add("Red");
		lista1.add("Green");
		lista1.add("Black");
		lista1.add("White");
		lista1.add("Pink");
		
		System.out.println("\nOriginalna niza: " + lista1);
		System.out.println("\nPrintaj koristejki go indexot na elementite: ");
		
		int no_of_elements = lista1.size();
		for (int index = 0; index < no_of_elements; index++) {
		
			
			System.out.println(lista1.get(index));
		}
		
	}

}
