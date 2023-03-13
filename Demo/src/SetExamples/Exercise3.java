package SetExamples;

import java.util.HashSet;

public class Exercise3 {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Red");
		set.add("Green");
		set.add("Black");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		
		System.out.println("Original HashSet: " + set);
		System.out.println("Size of the HashSet: " + set.size());
		
	}

}
