package vezbanje;

import java.util.ArrayList;
import java.util.List;

public class ZadacaLoops {
	
	public static void main(String[] args) {
		
		
		//1. Vnesete lista vo koja ima 10 broja
		//2. Da se napishe aplikacija koja kje presmeta kolku vkupno broevi ima, 
		//3. Sekoj od niv kolku cifri ima,
		//4. Dali e paren ili neparen i kolku vkupno broevi imame sho se parni a kolku neparni.
		//5. Da se presmeta sumata na site parni broevi, soodvetno i sumata na site neparni broevi
		
		
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(13);
		numbers.add(18);
		numbers.add(24);
		numbers.add(37);
		numbers.add(124);
		numbers.add(177);
		numbers.add(4256);
		numbers.add(12353);
		numbers.add(17853);
		numbers.add(256388);
		
		//1. Polnenje na lista
		System.out.println("Borevi vo listata: " + numbers);
		
		//2. Odreduvanje na brojot na elementi vo listata
		System.out.println("Vkupno broevi ima: " + numbers.size());
		
		//3. Kolku cifri imaat broevite
		ArrayList<Integer> countDigits = new ArrayList<>();
		countDigits = brojCifri(numbers);
		System.out.println("Sekoj od broevite ima: " + countDigits + " cifri ");
	}
		//3. Method za presmetuvanje kolku cifri imaat broevite
	public static ArrayList<Integer> brojCifri(List<Integer> numbers) {
		
		Integer counter = 0;
		ArrayList<Integer> rezultat = new ArrayList<>();
			
		for (Integer broj : numbers) {
			
			do {
				
				counter++;
				broj=broj/10;
			
			} while (broj !=0);
			
			rezultat.add(counter);
			counter = 0;
		
		}
			
		return rezultat;
		
		
		
		
		
		
	}

}
