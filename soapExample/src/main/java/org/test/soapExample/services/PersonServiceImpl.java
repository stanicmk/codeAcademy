package org.test.soapExample.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.test.soapExample.entity.Person;

@WebService(endpointInterface = "org.test.soapExample.services.PersonService")
public class PersonServiceImpl implements PersonService {
	
	private static List<Person> personCatalog;
	
	public  PersonServiceImpl() {
		initCatalog();
	}
	
	private void initCatalog() {
		
		if(personCatalog == null) {
			personCatalog = new ArrayList<Person>();
		}
		
		personCatalog.add(new Person(1, "Ognen", "Iloski", "Skopje"));
		personCatalog.add(new Person(2, "Borce", "Gjorgjievski", "Tetovo"));
		personCatalog.add(new Person(3, "Filip", "Nikoloski", "Prilep"));
		
	}
	
	public String insertPerson(Person person) {
		
		//insertInDb(person)
		return PersonDAO.insertPersonInDB(person);
		
		//add person in a list
//		personCatalog.add(person);
		
//		return "Person inserted successfully";
	}

	public Person findPersonById(Integer id) {
		
/*		for (Person person : personCatalog) {
			if(person.getId().equals(id)) {
				return person;
			}
			
		}
		
		return null;
*/
		return PersonDAO.findPersonByIdDB(id);
	}

	public List<Person> getAll() {
		
//		return personCatalog;
		return PersonDAO.getAllFromDb();
	}

}
