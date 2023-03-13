package loopsExamples;

import java.util.ArrayList;
import java.util.Collections;

public class Example1 {
	
	//1. Vnesete lista vo koja ima 10 broja
	//
	//2. Da se napishe aplikacija koja kje presmeta kolku vkupno broevi ima, sekoj od niv kolku cifri ima,
	//3. Dali e paren ili neparen i kolku vkupno broevi imame sho se parni a kolku neparni.
	//4. Da se presmeta sumata na site parni broevi, soodvetno i sumata na site neparni broevi
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(156);
		numbers.add(195);
		numbers.add(21);
		numbers.add(87);
		numbers.add(1257);
		numbers.add(96);
		numbers.add(1);
		numbers.add(6);
		numbers.add(7896);
		numbers.add(12345);
		numbers.add(78928218);
		
		System.out.println("Broevi: " + numbers);
		
		//1. Broj na elementi vo niza
		System.out.println("Vo nizata ima vkupno " + numbers.size() + " elementi");
		
		//2. Kolku cifri ima sekoj od broevite: [3, 3,2,2,4....]
		ArrayList<Integer> brCifri = new ArrayList<>();
		brCifri=countDigits(numbers);
		System.out.println("Sekoj od broevite ima soodvetno " + brCifri + " cifri");
		
		// 3. Da se presmeta po kolku broevi imaat isti broj na cifri
		// ["1 cifra: 5" , "2 cifri: 8"]
		
		System.out.println("Ist broj na cifrii imaat: " + istBrojNaCifri (brCifri));
		
		
		//4. Kolku parni broevi imame vo listata
		Integer vkupnoParni = parniBroevi(numbers);
		System.out.println("Vkupno ima " + vkupnoParni + " parni broevi");
		
		//5. Lista so parni broevi
		System.out.println("Parni broevi: " + listaParniBroevi(numbers));
		
		//6. Suma na neparni broevi
		System.out.println(sumaNeparniBroevi(numbers));
		
	}
	
	//2. Method za vtorata zadaca
	public static ArrayList<Integer> countDigits(ArrayList<Integer> lista) {
		Integer counter = 0;
		ArrayList<Integer> result = new ArrayList<>();
		
		for (Integer broj : lista) {
			
			
			do {
				counter++;
				broj = broj/10;
				
				
			} while (broj != 0);
			
		
			result.add(counter);
			counter=0;
			
		}
			 
		return result;
			
	}
			
				
	public static ArrayList<String> istBrojNaCifri(ArrayList<Integer> lista) {
			
			
		ArrayList<String> result = new ArrayList<>();

		Integer counter = 0;
		
		for (Integer broj : lista) {
	
			counter = Collections.frequency(lista, broj);
	//		Boolean res = lista.contains(broj);
	//		if(res) {
	//			counter++;
	//		}
			
			String temp = broj + " cifri: " + counter;
			
			if (!result.contains(temp)) {
				result.add(temp);
			}
		}
			
			
		return result;
			
			
	}
	
	//broi kolku imame parni broevi vo edna lista
	public static Integer parniBroevi(ArrayList<Integer> lista) {
		Integer counter = 0;
		for (Integer broj : lista) {
			if(broj%2 == 0) {
				counter++;
			}
			
		}
			
		return counter;
	}
	

	
	//vraka lista so site parni broevi
	public static ArrayList<Integer> listaParniBroevi(ArrayList<Integer> lista) {
		ArrayList<Integer> res = new ArrayList<>();
		
		for (Integer broj : lista) {
			if(broj%2 == 0) {
				res.add(broj);
			}
		
		}
			
		return res;
	}
			
	// Suma na site neparni broevi
	public static Integer sumaNeparniBroevi(ArrayList<Integer> lista) {
		Integer result = 0;
		
		for (Integer broj : lista) {
			if (broj%2 != 0) {
				result = result + broj;
			}
			
		}
			
		return result;
	}
	
			
}
