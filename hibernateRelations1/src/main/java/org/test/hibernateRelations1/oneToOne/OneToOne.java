package org.test.hibernateRelations1.oneToOne;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.test.hibernateRelations1.oneToOne.entity.Address;
import org.test.hibernateRelations1.oneToOne.entity.Student;

public class OneToOne {
	
	static SessionFactory factory;
	
	public static void main(String[] args) {
		
		Transaction tx = null;
		try {
			
			Configuration cfg = new Configuration();
			cfg.addAnnotatedClass(org.test.hibernateRelations1.oneToOne.entity.Student.class);
			cfg.addAnnotatedClass(org.test.hibernateRelations1.oneToOne.entity.Address.class);
			
			cfg.configure();
			
			factory = cfg.configure().buildSessionFactory();
			Session session = factory.openSession();
			
			tx = session.beginTransaction();
			
			//One to one mapping of entities
			
			Student student1 = new Student("Vlatko", "Doncev");
			Address address1 = new Address("Partizanska", "50", "Skopje");
			
			student1.setAddress(address1);
			address1.setStudent(student1);
			
			session.persist(student1);
			
			tx.commit();
			
			session.close();
			
			
		} catch (HibernateException e){
			tx.rollback();
			System.out.println(e);
		}
		
	}

}
