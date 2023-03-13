package SetExamples;

import java.util.HashSet;

public class Exercise4 {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Red");
		set.add("Green");
		set.add("Black");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		
		System.out.println("Original HashSet: " + set);
		
		set.removeAll(set);
		
		System.out.println("HashSet after removing all the elements: " + set);
	}

}
