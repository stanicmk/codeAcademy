package SetExamples;

import java.util.HashSet;
import java.util.Iterator;

public class Exercise2 {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet <>();
		
		set.add("Red");
		set.add("Green");
		set.add("Black");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		
		
		Iterator <String> i = set.iterator();
		
		while (i.hasNext()) {
			String string = (String) i.next();
			
			System.out.println(string);
			
		}
		
		
	}

}
