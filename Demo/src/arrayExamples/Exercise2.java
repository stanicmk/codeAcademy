package arrayExamples;

public class Exercise2 {
	
	public static void main(String[] args) {
		
		Integer celiBroevi[] = {3,4,5,7,9};
		Integer rezultat = 0;
		
		for (int i = 0; i < celiBroevi.length; i++) {
			
			
			//rezultat=rezultat + celiBroevi[i];
			rezultat += celiBroevi[i];
			
		}
		
		System.out.println("Rezultatot e " + rezultat);
		
		
		//odzemete gi broevite od nizata pocnuvajki od nazad
		
		Integer rez = 0;
		for (int i = celiBroevi.length - 1; i >= 0; i--) {
			rez = rez - celiBroevi[i];
			
		
	
		
	}
	
		System.out.println("Rezultatot od odzemanjeto e " + rez);
	}
	
}

