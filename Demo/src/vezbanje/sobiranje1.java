package vezbanje;

public class sobiranje1 {
	
	public static void main(String[] args) {
		
		Integer mojaNiza[] = {26, 37, 44, 87, 990};
		
		int rezultat = 0;
		
		for(int i = 0; i < mojaNiza.length; i++) {
		
		rezultat+=mojaNiza[i];
		
		
		
	}
		System.out.println("Rezultatot na sobiranjeto e: " + rezultat);
	
		Integer rez = 0;
		
		
	for(int i = mojaNiza.length - 1; i >= 0; --i) {
		rez = rez - mojaNiza[i];
		
	}
	System.out.println("Rezultatot na odzemanjeto e: " + rez);
	
	} 
}
