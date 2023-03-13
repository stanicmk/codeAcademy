package jaxbExample1;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class MarshallerExample {
	
	public static void main(String[] args) {
		
		
		try {
			JAXBContext context = JAXBContext.newInstance(Fruits.class);//Fruit.class);
			
			Marshaller jaxbMarshaller = context.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			Fruit fruit = new Fruit();
			fruit.setId(1);
			fruit.setName("Banana");
			fruit.setPrice("70mkd");
			
			Fruit fruit2 = new Fruit();
			fruit2.setId(2);
			fruit2.setName("Orange");
			fruit2.setPrice("60mkd");
			
			//List<Fruit> list = new ArrayList<>();
			//list.add(fruit);
			//list.add(fruit2);
			
			
			
			Fruit fruit3 = new Fruit();
			fruit3.setId(3);
			fruit3.setName("Watarmellon");
			fruit3.setPrice("30mkd");
			
			Fruit fruit4 = new Fruit();
			fruit4.setId(4);
			fruit4.setName("Mango");
			fruit4.setPrice("200mkd");
			
			
			Fruits fr = new Fruits();
			
			fr.getFruits().add(fruit);
			fr.getFruits().add(fruit2);
			fr.getFruits().add(fruit3);
			fr.getFruits().add(fruit4);
			
			
			jaxbMarshaller.marshal(fr, new File("C:\\Users\\FFM CATAPULT\\Documents\\fruits.xml")); 
			//System.out);//new File("C:/ime.xml"));//System.out);
			
		}catch(JAXBException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
