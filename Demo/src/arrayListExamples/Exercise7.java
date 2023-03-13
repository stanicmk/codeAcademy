package arrayListExamples;

import java.util.ArrayList;

public class Exercise7 {
	
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("White");
		colors.add("Black");
		colors.add("Red");
		colors.add("Orange");
		
		System.out.println("Original array: " + colors);
		
		System.out.println(colors.contains("Red"));
		
		String result = ifContains(colors, "Red");
		
		System.out.println(result);
		
		System.out.println(ifContains(colors, "Red"));
		
	}
	
	public static String ifContains(ArrayList<String> lista, String element) {
		
		if (lista.isEmpty()) {
			return "Listata e prazna";
		}else {
		for (String boja : lista) {
			if(boja == element) {
				return "Bojata postoi vo listata";
			}
		}
		return "Bojata ne postoi";
		}
		
			
	
	
	}
	
				
}
	
	
	
	
	
	
	
	
	
	
	

