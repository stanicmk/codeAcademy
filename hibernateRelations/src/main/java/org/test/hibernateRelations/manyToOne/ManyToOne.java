
package org.test.hibernateRelations.manyToOne;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.test.hibernateRelations.manyToOne.entity.Department;
import org.test.hibernateRelations.manyToOne.entity.Employee;
import org.test.hibernateRelations.manyToOne.entity.Project;
import org.test.hibernateRelations.oneToMany.entity.Answer;
import org.test.hibernateRelations.oneToMany.entity.Question;

public class ManyToOne {
	
	static SessionFactory factory;
	
	public static void main(String[] args) {
		
		Transaction tx = null;
		
		try {
			
			Configuration cfg = new Configuration();
			cfg.addAnnotatedClass(org.test.hibernateRelations.manyToOne.entity.Department.class);
			cfg.addAnnotatedClass(org.test.hibernateRelations.manyToOne.entity.Employee.class);
			cfg.addAnnotatedClass(org.test.hibernateRelations.manyToOne.entity.Project.class);
			
			
			cfg.configure();
			
			factory = cfg.configure().buildSessionFactory();
			Session session = factory.openSession();
			tx=session.beginTransaction();
			
			//Many to one relation
			
			Project project1 = new Project("IoT", "Description of comunication project");
			session.save(project1);
			
			Department dept1 = new Department("Marketing", 8);
			dept1.setProject(project1);
			session.save(dept1);
			
			Date date = new Date(System.currentTimeMillis());
			
			Employee e1 = new Employee("Ognen Iloski", 90000, date);
			e1.setDepartment(dept1);
			
			
			Employee e2 = new Employee("Dimitar Josifov", 90000, date);
			e2.setDepartment(dept1);
			session.save(e2);
			
			
			
			findEmployeeData(2L, session);
			
			
			
			tx.commit();
			session.close();
			
			
		} catch (HibernateException e) {
			tx.rollback();
			System.out.println(e);
		}
		
	}

	private static void findEmployeeData(long employeeNumber, Session session) {
		
		String hql = "SELECT e FROM Employee e WHERE e.id=:empId";
		
		//String hqlJoin = "SELECT e d FROM Employee e JOIN e.department WHERE e.id=d.id";
		//find all employees working on same project
		//find all employees working on predefined department
		//find all employees working in same department
		
		
		Query query = session.createQuery(hql);
		List<Employee> result = query.setParameter("empId", employeeNumber).list();
		
		System.out.println("Ime i prezime: " + result.get(0).getName());
		
		Department dept = result.get(0).getDepartment();
		System.out.println("Dept name: " + dept.getDeptName());
		
		Project project = dept.getProject();
		System.out.println("Project name: " +project.getProjectName());	
		
		
	}

}
