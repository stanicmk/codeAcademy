package arrayExamples;

import java.util.Arrays;
import java.util.HashSet;

public class Exercise14 {
	
	public static void main(String[] args) {
		
		
		String niza1[] = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
		
		String niza2[] = {"mySQL", "SQL", "SQlite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
		
		System.out.println("Niza1 : " +Arrays.toString(niza1));
		System.out.println("Niza2 : " +Arrays.toString(niza2));
		
		HashSet<String> set = new HashSet<String>();
		
		for (int i = 0; i <niza1.length; i++) {
			
			for (int j = 0; j < niza2.length; j++) {
				
				if(niza1[i].equals(niza2[j])) {
					set.add(niza1[i]);
				}
			}
		}
		System.out.println("Zaednicki element e: "+(set));
	}

}
