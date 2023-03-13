package vezbanje;

import java.util.ArrayList;
import java.util.Iterator;

public class Percentage {
	
	public static void main(String[] args) {



		ArrayList<Integer> exam = new ArrayList<>();
		exam.add(6);
		exam.add(10);
		exam.add(4);
		
		System.out.println("3 = " + exam);
		
		Integer max = 0;	
		for (int i = 0; i <exam.size(); i++) {
				max += exam.get(i);
			}
		System.out.println("Maximum bodovi na ispitot se " + max);
		
		ArrayList<Integer> kristina = new ArrayList<>();
		kristina.add(6);
		kristina.add(10);
		kristina.add(4);
		
		Integer krisTotal = 0;
		for (int i = 0; i < kristina.size(); i++) {
			krisTotal += kristina.get(i);	
			}
		System.out.println("Kristina ima " + krisTotal + " osvoeni bodovi na ispit");
		
		ArrayList<Integer> teo = new ArrayList<>();
		teo.add(3);
		teo.add(6);
		teo.add(2);
		
		Integer teoTotal = 0;
		for (int i = 0; i < teo.size(); i++) {
			teoTotal += teo.get(i);		
		}
		System.out.println("Teo ima " + teoTotal + " osvoeni bodovi na ispit");
		
		ArrayList<Integer> vladimir = new ArrayList<>();
		vladimir.add(1);
		vladimir.add(2);
		vladimir.add(3);
		
		Integer vladimirTotal = 0;
		for (int i = 0; i < vladimir.size(); i++) {
			vladimirTotal += vladimir.get(i);		
		}
		System.out.println("Vladimir ima " + vladimirTotal + " osvoeni bodovi na ispit");
		
		Double procentKristi = (double) (krisTotal*100/20);
		Double procentTeo = (double) (teoTotal*100/20);
		Double procentVladimir = (double) (vladimirTotal*100/20);
		
		if(procentKristi > 50) {
			System.out.println("Krisitna go polozi ispitot so: " + krisTotal + " bodovi");
		}
		else {
			System.out.println("Krisitna ne go polozi ispitot");
		}
		
		if(procentTeo > 50) {
			System.out.println("Teo go polozi ispitot so: " + teoTotal + " bodovi");
		}
		else {
			System.out.println("Teo ne go polozi ispitot");
		}
		
		if(procentVladimir > 50) {
			System.out.println("Vladimir go polozi ispitot so: " + vladimirTotal);
		}
		else {
			System.out.println("Vladimir ne go polozi ispitot");
		}
	}
	
	
	
	
	
}
