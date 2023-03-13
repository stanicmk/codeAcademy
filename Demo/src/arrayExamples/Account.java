package arrayExamples;

public class Account {
	//class parameters
	Integer a;
	Integer b;
	
	public Account(Integer a, Integer b) {
		super();
		a = a;
		b = b;
	}
	
	
	public Account() {
		super();
		
	}


	@Override
	public String toString() {
		return "Account [a=" + a + ", b=" + b + "]";
	}
	
	//set a and b with parameters from input (c, d)
	public void setData(Integer c, Integer d) {
		
		a=c;
		b=d;
		
		
	}
		
		//prints object values
		public void showData() {
			System.out.println("a=" + a);
			System.out.println("b=" + b);
			
		}
		
	
			
		}
		
			
			

		
		

	
	
	
	
	


