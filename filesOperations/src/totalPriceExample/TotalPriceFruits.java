package totalPriceExample;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import jaxbExample1.Fruit;
import jaxbExample1.Fruits;

public class TotalPriceFruits {

	public static void main(String[] args) {

		System.out.println("Total price = " + totalPrice("C:\\Users\\FFM CATAPULT\\Documents\\fruits.xml"));

	}

	private static Integer totalPrice(String filepath) {

		File file = new File(filepath);
		Fruits f = new Fruits();
		Integer totalPrice = 0;

		try {
			JAXBContext context = JAXBContext.newInstance(Fruits.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			f = (Fruits) unmarshaller.unmarshal(file);

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Fruit fruit : f.getFruits()) {
			Integer price = 0;

			if (fruit.getPrice().endsWith("mkd")) {

				Integer x = getPriceAsInt(fruit.getPrice());
				totalPrice = totalPrice + x;
			}

		}

		return totalPrice;

	}

	public static Integer getPriceAsInt(String priceWithMkd) {

		char[] listFromString = priceWithMkd.toCharArray();
		Integer length = listFromString.length;
		String value = priceWithMkd.substring(0, length - 3);

		Integer x = Integer.parseInt(value);

		return x;
	}

}
