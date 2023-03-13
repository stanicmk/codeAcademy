package vezbanje;

import java.util.ArrayList;

public class UpdateNiza {
	
	public static void main(String[] args) {
		
		ArrayList<String> color_list = new ArrayList<>();
		
		color_list.add("Red");
		color_list.add("Green");
		color_list.add("Orange");
		color_list.add("White");
		color_list.add("Black");
		
		System.out.println(color_list);
		
		color_list.set(2, "Yellow");
		
		System.out.println(color_list);
		
		color_list.set(3, "Pink");
		
		System.out.println(color_list);
			
	}
		
}
		
		
		
		

