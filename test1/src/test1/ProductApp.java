package test1;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;










public class ProductApp {

	public static void main(String[] args) throws JAXBException {

		String filePath = "resources/products.xml";
		Products lista = readXml(filePath);

		System.out.println(lista.getProducts());
		System.out.println("Ima vkupno produkti: " + lista.getProducts().size());

		minMax(lista.getProducts());
		countTypes(lista.getProducts());
		countKindOfTypes(lista.getProducts());
		allLists(lista.getProducts());
		
		
		
		
	
		
		Product p1 = new Product();
		p1.setId(500001);
		p1.setName("Red Bull");
		p1.setType("newProduct");
		p1.setPrice("115MKD");
		p1.setWeight("1kg");
		p1.setQuantity("0.250");
		
		Product p2 = new Product();
		p2.setId(500002);
		p2.setName("Ham");
		p2.setType("newProduct");
		p2.setPrice("250MKD");
		p2.setWeight("1kg");
		p2.setQuantity("0.250");
		
		Product p3 = new Product();
		p3.setId(500003);
		p3.setName("Peach");
		p3.setType("newProduct");
		p3.setPrice("120MKD");
		p3.setWeight("1kg");
		p3.setQuantity("2.5");
		
		Product p4 = new Product();
		p4.setId(500004);
		p4.setName("biscuits");
		p4.setType("newProduct");
		p4.setPrice("120MKD");
		p4.setWeight("1kg");
		p4.setQuantity("0.650");
		
		
		
		lista.getProducts().add(p1);
		lista.getProducts().add(p2);
		lista.getProducts().add(p3);
		lista.getProducts().add(p4);
		
		
		try {
			
			JAXBContext context = JAXBContext.newInstance(Products.class);
			
			Marshaller jaxbMarshaller = context.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			
			jaxbMarshaller.marshal(lista, new File("C:\\Users\\FFM CATAPULT\\Documents\\NewProducts.xml"));
			
			
		} catch (Exception e) {
		
		}

	}

	
		
	
	private static void allLists(List<Product> products) {
		
		HashMap<String,ArrayList<Product>> typeMap  = new HashMap<>();
		
		for (Product product : products) {
			
			
		}
	
		
		
		
		
	}




	private static void countKindOfTypes(List<Product> products) {
	
		
		HashSet<String> countTypes = new HashSet<>();
		
		Integer counter = 0;
		
		for (int i = 0; i < products.size(); i++) {
			
			for (Product product : products) {
				if (products.get(i).getId().equals(product.getType())) {
					counter++;
				}
			countTypes.add(products.get(i).getType());
		}
		
			counter = 0;
			
		}
		System.out.println(countTypes);
		System.out.println("Number of types:" + countTypes.size());
	}




	
	private static void countTypes(List<Product> products) {
		
HashMap<String, Integer> countMap = new HashMap<>();
		
		Integer counter = 0;
		
			
			for (int i = 0; i < products.size(); i++) {
				
				for (Product product : products) {
					if (products.get(i).getType().equals(product.getType())) {
						counter++;
					}
					
				countMap.put(products.get(i).getType(), counter);
				
			}
				counter = 0;
		}
			System.out.println(countMap);
		
		
				
			
		} 
		
		
	
	
	





	private static void minMax(List<Product> products) {

		HashMap<Integer, Double> priceMap = new HashMap<>();

		for (Product product : products) {

			product.getPrice();
			
			Integer articlePrice = getPriceAsInt(product.getPrice());
			
			Double quantity = Double.valueOf(product.getQuantity());
			priceMap.put(product.getId(), articlePrice * quantity);
			
		}
		
		System.out.println(priceMap);
		
		Set<Integer> keys = priceMap.keySet();
		Double min = 0.0;
		Double max = 0.0;
		Integer minProdKey = 0;
		Integer maxProdKey = 0;
		
		Boolean flag = true;
		
		for (Integer key : keys) {
			
			if (flag) {
			min = priceMap.get(key);
			minProdKey = key;
			max = priceMap.get(key);
			maxProdKey = key;
			flag = false;
			}
			
			if(min > priceMap.get(key)) {
				min = priceMap.get(key);
				minProdKey = key;
			}
			if(max < priceMap.get(key)) {
				max = priceMap.get(key);
				maxProdKey = key;

			}
		
		}
		System.out.println("Product so najniska cena: " + minProdKey + " " + min);
		System.out.println("Product so najvisoka cena: " + maxProdKey + " " + max);
		
		
		
	}



	private static Products readXml(String filePath) throws JAXBException {

		JAXBContext context = JAXBContext.newInstance(Products.class);

		File file = new File(filePath);

		Unmarshaller unmarshaller = context.createUnmarshaller();

		Products p = (Products) unmarshaller.unmarshal(file);

		return p;
	}

	public static Integer getPriceAsInt(String priceWithMKD) {

			char[] listFromString = priceWithMKD.toCharArray();
			Integer length = listFromString.length;
			String value = priceWithMKD.substring(0, length - 3);

			Integer x = Integer.parseInt(value);

			return x;
	}
	
	
	
	

	
	
	
}
