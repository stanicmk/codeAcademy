package SetExamples;

import java.util.HashSet;

public class Exercise5 {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Red");
		set.add("Blue");
		set.add("Green");
		set.add("Black");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		
		System.out.println("Original HashSet:" + set);
		
		HashSet<String> newset = new HashSet<>();
		newset = (HashSet)set.clone();
		
		System.out.println("Cloned HashSet:" + newset);
		
		
	}

}
