package Examples;

public class ExamplesSobiranje {
	
	public static void main(String[] args) {
		
		Integer a = 25;
		Integer b = 33;
		Integer c = 100;
		
		Integer rezultat=0;
		
		rezultat = sobiranje(a, b, c);
		System.out.println(rezultat);
		
		rezultat = odzemanje(c, b, a);
		System.out.println(rezultat);
		
	}
	
	public static Integer sobiranje(Integer x, Integer y, Integer z) {
		return x+y+z;
	}

	//odzemanje c-b-a
	
	public static Integer odzemanje(Integer x, Integer y, Integer z) {
		return x-y-z;
	}
	
}
