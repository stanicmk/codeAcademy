package SetExamples;

import java.util.HashSet;
import java.util.Iterator;

public class Exercise1 {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Red");
		set.add("Green");
		set.add("Black");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		
		System.out.println("Hash Set: " + set);
		
		
		//So iterator gi printa edno pod drugo
		Iterator<String> i = set.iterator();
		
		while (i.hasNext()) {
		
			System.out.println(i.next());
				
			}
		
	}

}
