package arrayListExamples;

import java.util.ArrayList;

public class Exercise20 {
	
	public static void main(String[] args) {
		
		ArrayList<String> lista1 = new ArrayList<>();
		
		lista1.add("Red");
		lista1.add("Green");
		lista1.add("Black");
		
		System.out.println("Originalna Niza: " + lista1);
		//zgolemi go kapacitetot do 6
		
		lista1.ensureCapacity(6);
		lista1.add("White");
		lista1.add("Pink");
		lista1.add("Yellow");
		
		System.out.println("Nova niza: " + lista1);
		
	
	
		
	}

}
