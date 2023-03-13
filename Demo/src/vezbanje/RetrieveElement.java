package vezbanje;

import java.util.ArrayList;

public class RetrieveElement {
	
	public static void main(String[] args) {
		
		ArrayList<String> niza = new ArrayList<>();
		
		niza.add("Red");
		niza.add("Green");
		niza.add("Orange");
		niza.add("White");
		niza.add("Black");
		
		System.out.println(niza);
		
	    String element = niza.get(0);
	    System.out.println("Prv element od nizata e " + element);
		
		
		
		element = niza.get(4);
		System.out.println("Petiot element od nizata e " + element);
		
		
		element = niza.get(2);
		System.out.println("Tretiot element od nizata e " + element);
		
		
		
		
		
		
		
	}

}
