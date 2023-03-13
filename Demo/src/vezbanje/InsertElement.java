package vezbanje;

import java.util.ArrayList;

public class InsertElement {
	
	public static void main(String[] args) {
		
		ArrayList<String> mojaNiza = new ArrayList<>();
		
		mojaNiza.add("Red");
		mojaNiza.add("Green");
		mojaNiza.add("Orange");
		mojaNiza.add("White");
		mojaNiza.add("Black");
		
		System.out.println(mojaNiza);
		
		mojaNiza.add(0, "Pink");
		mojaNiza.add(1, "Yellow");
		
		System.out.println(mojaNiza);
	
	
	
	
	}

}
