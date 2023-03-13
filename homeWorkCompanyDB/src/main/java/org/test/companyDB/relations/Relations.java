package org.test.companyDB.relations;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.test.companyDB.relations.entity.Department;
import org.test.companyDB.relations.entity.Employee;


public class Relations {
	
	static SessionFactory factory;
	public static void main(String[] args) throws ParseException {
		
		Transaction tx = null;
		
		try {
			Configuration cfg = new Configuration();
			
			cfg.addAnnotatedClass(org.test.companyDB.relations.entity.Employee.class);
			cfg.addAnnotatedClass(org.test.companyDB.relations.entity.Department.class);
			cfg.addAnnotatedClass(org.test.companyDB.relations.entity.Project.class);
			cfg.addAnnotatedClass(org.test.companyDB.relations.entity.Dependent.class);
			cfg.addAnnotatedClass(org.test.companyDB.relations.entity.Works_on.class);
			cfg.addAnnotatedClass(org.test.companyDB.relations.entity.Dept_locations.class);
			
			
			factory = cfg.configure().buildSessionFactory();
			Session session = factory.openSession();
			tx = session.beginTransaction();
			
			
			DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date d1 = df1.parse("1981-06-19");
			Date sqlDate1 = new Date(d1.getTime());
			
			Department dept1 = new Department("Headquarters", 1, sqlDate1);
			
			
			
			tx.commit();
			session.close();
			
			
		} catch (HibernateException e) {
			tx.rollback();
			System.out.println(e);
		}
		
	}

}
