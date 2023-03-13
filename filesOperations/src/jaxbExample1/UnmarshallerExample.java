package jaxbExample1;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnmarshallerExample {
	
	public static void main(String[] args) {
		
		try {
			JAXBContext context = JAXBContext.newInstance(Fruits.class);
			
			File file = new File("C:\\Users\\FFM CATAPULT\\Documents\\fruit.xml");
			
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			Fruits f = (Fruits) unmarshaller.unmarshal(file);
			
			
			for (Fruit fruit : f.getFruits()) {
				System.out.println("id: " + fruit.getId() + ", name: " + fruit.getName() + ", price: " + fruit.getPrice());
			}
			
			//System.out.println(f.getFruits());
			//System.out.println("id: " + f.getId() + ", name: " + f.getName() + ", price: " + f.getPrice());
			
		
		
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		
	}
		
		
}
	
	

