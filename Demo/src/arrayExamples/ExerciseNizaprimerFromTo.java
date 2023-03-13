package arrayExamples;

import java.util.Arrays;

public class ExerciseNizaprimerFromTo {

	public static void main(String[] args) {

	

	Integer celiBroevi[] = { 1789, 2035, 1899, 1456, 9999, 3123, 3045, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165,
			1457, 2456 }; {
				
				System.out.println(Arrays.toString(fromTo(1700, 2300, celiBroevi)));
			}
			
			}

	
	
	


public static Integer[] fromTo(Integer from, Integer to, Integer niza[]) {
	
	Integer rezLength = countNumbers(from, to, niza);
	
	Integer rez[] = new Integer[rezLength];
	Integer j=0;
	
	for (int i=0; i <niza.length; i++) {
		
		if((niza[i] > from) && (niza[i] < to)) {
			System.out.println(niza[i]);
			rez[j] = niza[i];
			j++;
		}
	}
	
	return rez;

}

public static Integer countNumbers(Integer from, Integer to, Integer niza[]) {
	 Integer res = 0;
	
	
	for(int i = 0; i < niza.length; i++) {
		
		if ((niza[i] > from) && (niza[i] < to)) {
			res++;
		}
			
	}
	
	
	System.out.println("Brojot na elementi vo nizata e:" + res);
	return res;
}		
}
