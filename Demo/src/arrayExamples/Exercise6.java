package arrayExamples;

public class Exercise6 {
	
	public static Integer findIndex (int[] mojaNiza, int t) {
		
		if(mojaNiza == null) return -1;
		int len = mojaNiza.length;
		int i = 0;
		while (i < len) {
			if (mojaNiza[i] == t) return i;
			else i=i+1;
		}
		return -1;
	}
public static void main(String[] args) {
	int mojaNiza[] = {25,14,56,15,36,56,77,18,29,49};
	System.out.println("Index pozicijata na brojot 25 e: " + findIndex(mojaNiza, 25));
	System.out.println("Index pozicijata na brojot 77 e: " + findIndex(mojaNiza, 77));
	
	

}
}
