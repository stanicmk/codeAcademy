package vezbanje;

public class Sobiranje2 {
	
	public static void main(String[] args) {
		
		Integer a = 26;
		Integer b = 38;
		Integer c = 146;
		
		Integer rezultat = 0;
		
		rezultat = sobiranje(a,b,c);
	
		System.out.println(rezultat);
	}

	private static Integer sobiranje(Integer x, Integer y, Integer z) {
		return x+y+z;
		
		
	}
	

}
