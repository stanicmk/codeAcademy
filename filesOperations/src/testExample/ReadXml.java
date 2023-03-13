package testExample;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class ReadXml {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		try {
			
			
		
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		File f = new File("C:\\Users\\FFM CATAPULT\\Downloads\\products_xml.xml");
		
		Document doc = db.parse(f);
		
		doc.getDocumentElement().normalize();
		
		System.out.println("Root element:" + doc.getDocumentElement().getNodeName());
		
		NodeList nodeList = doc.getElementsByTagName("article");
		
		for (int i = 0; i < nodeList.getLength(); i++) {
			 Node node = nodeList.item(i);
			 
			 System.out.println("\nNode Name: " + node.getNodeName());
			 
			 if (node.getNodeType() == Node.ELEMENT_NODE);{
				 Element e = (Element) node;  
				
				 String id = e.getAttribute("id");
				 System.out.println(id);
				 
				 String name = e.getElementsByTagName("name").item(0).getTextContent();
				 System.out.println(name);
				 
				 String type = e.getElementsByTagName("type").item(0).getTextContent();
				 System.out.println(type);
				 
				 String price = e.getElementsByTagName("price").item(0).getTextContent();
				 System.out.println(price);
				 
				 String weight = e.getElementsByTagName("weight").item(0).getTextContent();
				 System.out.println(weight);
				 
				 String quantity = e.getElementsByTagName("quantity").item(0).getTextContent();
				 System.out.println(quantity);
			 }
			 
		}
		
	}
	

 catch (Exception e) {
	
	e.printStackTrace();
}
}
}