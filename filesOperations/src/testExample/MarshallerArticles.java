package testExample;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MarshallerArticles {
	
	

	public static void main(String[] args) {
		
	
		Articles artikli = new Articles();
		
		artikli.getArticles();
		
		
		
		Article article1 = new Article();
		
		article1.setId(100001);
		article1.setName("Coca Cola");
		article1.setType("drink");
		article1.setPrice("50mkd");
		article1.setWeight("2l");
		article1.setQuantity(1);
		
		Article article2 = new Article();
		
		article2.setId(200001);
		article2.setName("Bread");
		article2.setType("food");
		article2.setPrice("30mkd");
		article2.setWeight("500g");
		article2.setQuantity(1);
		
		Article article3 = new Article();
		
		article3.setId(100002);
		article3.setName("Mineral water");
		article3.setType("drink");
		article3.setPrice("20mkd");
		article3.setWeight("1.5l");
		article3.setQuantity(1);
		
		Article article4 = new Article();
		
		article4.setId(200002);
		article4.setName("Meat");
		article4.setType("food");
		article4.setPrice("320mkd");
		article4.setWeight("1kg");
		article4.setQuantity(0.850);
		
		Article article5 = new Article();
		
		article5.setId(200003);
		article5.setName("Banana");
		article5.setType("food");
		article5.setPrice("60mkd");
		article5.setWeight("1kg");
		article5.setQuantity(0.5);
		
		Article article6 = new Article();
		
		article6.setId(200004);
		article6.setName("Banana");
		article6.setType("food");
		article6.setPrice("60mkd");
		article6.setWeight("1kg");
		article6.setQuantity(0.5);
		
		Article article7 = new Article();
		
		article7.setId(100003);
		article7.setName("Fanta");
		article7.setType("drink");
		article7.setPrice("50mkd");
		article7.setWeight("1.5l");
		article7.setQuantity(1);
		
		Article article8 = new Article();
		
		article8.setId(200005);
		article8.setName("Chocolate");
		article8.setType("food");
		article8.setPrice("50mkd");
		article8.setWeight("100g");
		article8.setQuantity(1);
		
		
		
		
		Articles art = new Articles();
		
		art.getArticles().add(article1);
		art.getArticles().add(article2);
		art.getArticles().add(article3);
		art.getArticles().add(article4);
		art.getArticles().add(article5);
		art.getArticles().add(article6);
		art.getArticles().add(article7);
		art.getArticles().add(article8);
		
		
		
		
		try {
			
			JAXBContext context = JAXBContext.newInstance(Articles.class);
			
			Marshaller jaxbMarshaller = context.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			
			
			jaxbMarshaller.marshal(art, new File("C:\\Users\\FFM CATAPULT\\Documents\\articles.xml")); 
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
			

}
