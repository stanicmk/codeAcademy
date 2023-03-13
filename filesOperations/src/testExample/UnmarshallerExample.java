package testExample;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnmarshallerExample {
	
	public static void main(String[] args) {
		
		try {
			JAXBContext context = JAXBContext.newInstance(Articles.class);
			
			File file = new File("C:\\Users\\FFM CATAPULT\\Documents\\articles.xml");
			
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			Articles f = (Articles) unmarshaller.unmarshal(file);
			
			
			for (Article articles : f.getArticles()) {
				System.out.println("id: " + articles.getId() + ", name: " + articles.getName() + ", price: " + articles.getPrice());
			}
			
			//System.out.println(f.getFruits());
			//System.out.println("id: " + f.getId() + ", name: " + f.getName() + ", price: " + f.getPrice());
			
		
		
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		
	}
		
		
}
	
	

