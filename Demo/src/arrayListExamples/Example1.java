package arrayListExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		
		System.out.println(fruits.isEmpty());
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Peach");
		fruits.add("Strawberry");
		
		fruits.add(0, "Watermelon");
		
		System.out.println("Element with index 1 has value: " + fruits.get(1));
		
		System.out.println("List of Fruits: " + fruits.toString());
	
		
		fruits.remove(0);
		fruits.remove("Apple");
		
		//fruits.clear();// ja brise cela lista
		
		
		System.out.println("List of Fruits: " + fruits);
		
		//for each loop
		for (String ovosje : fruits) {
			
			System.out.println("Fruit: " + ovosje);
			
		}
		//for loop
		Integer j = 0;
		for (int i = 0; i < fruits.size(); i++) {
			
		}
		
		System.out.println(fruits);
		

	}

}
