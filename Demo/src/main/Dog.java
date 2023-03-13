
package main;

public class Dog {

	public String breed;
	public String size;
	public Integer age;
	
	
	public String getInfo() {
		return " Dog breed: " + breed + " Dog size: " + size + " Dog age: " + age;
		
	}
	
	public static void main(String[] args) {
		
		Dog maltese= new Dog();
				
		maltese.breed = "maltese";
		maltese.size = "medium";
		maltese.age = 2;
		
		String res = maltese.getInfo();
		
		System.out.println(res);
		
		System.out.println(maltese.getInfo());
		
	}
	
	//1.napravete main metod vo nova klasa
	//2.iskucajte go kodot za Doktor i Surgeon
	//3.testirajte overriding na metodite vo Doktor i Surgeon
	
	
}




