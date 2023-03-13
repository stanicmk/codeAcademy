package org.test.hibernateRelations.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.test.hibernateRelations.oneToMany.entity.Answer;
import org.test.hibernateRelations.oneToMany.entity.Question;

public class OneToMany {
	
	static SessionFactory factory;
	
	public static void main(String[] args) {
		
		Transaction tx = null;
		
		try {
			
			Configuration cfg = new Configuration();
			cfg.addAnnotatedClass(org.test.hibernateRelations.oneToMany.entity.Answer.class);
			cfg.addAnnotatedClass(org.test.hibernateRelations.oneToMany.entity.Question.class);
			
			cfg.configure();
			
			factory = cfg.configure().buildSessionFactory();
			Session session = factory.openSession();
			tx=session.beginTransaction();
			
			//One to many relation
			
			Question question1 = new Question("what is Java?");
			
			Answer answer1 = new Answer("Java is programing language", "Dimitar");
			Answer answer2 = new Answer("Java is OOP language", "Aleksandar");
			Answer answer3 = new Answer("Java is cool", "Vlatko");
			
			List<Answer> result = new ArrayList<Answer>();
			
			result.add(answer1);
			result.add(answer2);
			result.add(answer3);
			
			question1.setAnswers(result);
			
			session.persist(question1);
			
			tx.commit();
			session.close();
			
			
		} catch (HibernateException e) {
			tx.rollback();
			System.out.println(e);
		}
	}

}
