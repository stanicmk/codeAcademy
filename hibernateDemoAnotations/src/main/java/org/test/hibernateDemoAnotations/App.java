package org.test.hibernateDemoAnotations;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 

	
{
	
	static SessionFactory factory;
	
    public static void main( String[] args )
    {
    	
    	Transaction tx = null;
    	
    	try {
    		Configuration cfg = new Configuration();
    		cfg.addAnnotatedClass(org.test.hibernateDemoAnotations.entity.Employee.class);
    		
    		cfg.configure();
    		factory = cfg.configure().buildSessionFactory();
    		Session session = factory.openSession();
			
		} catch (HibernateException e) {
			// TODO: handle exception
		}
       
    }
}
