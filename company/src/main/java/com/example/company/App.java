package com.example.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;


import com.example.company.entity.Department;
import com.example.company.entity.DeptLocationId;
import com.example.company.entity.DeptLocations;
import com.example.company.entity.Employee;
import com.example.company.entity.Project;
import com.example.company.entity.WorksOn;
import com.example.company.entity.WorksOnId;
import com.example.company.services.CompanyServices;
import com.example.company.services.Implementacija;
import com.example.company.entity.Dependent;
import com.example.company.entity.DependentId;







public class App 
{
	
	static SessionFactory factory;
    public static void main( String[] args ) {
        
    	Transaction tx = null;
    	
    	try {
    		
    		Configuration cfg = new Configuration();
			
    		cfg.addAnnotatedClass(com.example.company.entity.Department.class);
    		cfg.addAnnotatedClass(com.example.company.entity.Employee.class);
    		cfg.addAnnotatedClass(com.example.company.entity.DependentId.class);
    		cfg.addAnnotatedClass(com.example.company.entity.Dependent.class);
    		cfg.addAnnotatedClass(com.example.company.entity.Project.class);
    		cfg.addAnnotatedClass(com.example.company.entity.WorksOn.class);
    		cfg.addAnnotatedClass(com.example.company.entity.WorksOnId.class);
    		cfg.addAnnotatedClass(com.example.company.entity.DeptLocationId.class);
    		cfg.addAnnotatedClass(com.example.company.entity.DeptLocations.class);
    		cfg.configure();
    		
    		factory = cfg.configure().buildSessionFactory();
    		Session session = factory.openSession();
    		
    		tx = session.beginTransaction();
    		
    		
    		CompanyServices cs = new Implementacija();
    		
    		//List<Department> dep = new ArrayList<Department>();
    		
    		Date date1 = new Date(System.currentTimeMillis());
    		
    		Department department1 = new Department("Research", date1);
    		Department department2 = new Department("Administration", date1);
    		Department department3 = new Department("Headquorters", date1);
    		
    		session.save(department1);
    	    session.save(department2);
    	    session.save(department3);
    	    
    	    Employee employee1 = new Employee("John",  "Smith","B",  date1, "Petar Demirski 14/9 Negotino", "M", 25000,department1);
    	    Employee employee2 = new Employee("Franklin",  "Wong","T",  date1, "Petar Demirski 14/9 Negotino", "M", 25000,department1);
    	    Employee employee3 = new Employee("Alicia",  "Zelaya","J",  date1, "Petar Demirski 14/9 Negotino", "M", 25000,department2);
    		Employee employee4 = new Employee("Jennifer",  "Wallace","S",  date1, "Petar Demirski 14/9 Negotino", "M", 25000,department2);
    		Employee employee5 = new Employee("Ramash",  "Narayan","K",  date1, "Petar Demirski 14/9 Negotino", "M", 25000,department1);
    		Employee employee6 = new Employee("Joyce",  "English","A",  date1, "Petar Demirski 14/9 Negotino", "M", 25000,department1);
    		Employee employee7 = new Employee("Ahmad",  "Jabber","V",  date1, "Petar Demirski 14/9 Negotino", "M", 25000,department2);
    		Employee employee8 = new Employee("James",  "Borg","E",  date1, "Petar Demirski 14/9 Negotino", "M", 25000,department3);
    		
    		session.save(employee1);
    		session.save(employee2);
    		session.save(employee3);
    		session.save(employee4);
            session.save(employee5);
    		session.save(employee6);
    		session.save(employee7);
    		session.save(employee8);
    		
    		department1.setMgr_ssn(employee5);
    		department2.setMgr_ssn(employee6);
    		department3.setMgr_ssn(employee3);
    		
    		session.save(department1);
    	    session.save(department2);
    	    session.save(department3);
    	    
    	    employee1.setSuperSSN(employee2);
    	    employee2.setSuperSSN(employee8);
    	    employee3.setSuperSSN(employee4);
    	    employee4.setSuperSSN(employee8);
    	    employee5.setSuperSSN(employee2);
    	    employee6.setSuperSSN(employee2);
    	    employee7.setSuperSSN(employee4);
    	    
    	    session.save(employee1);
    		session.save(employee2);
    		session.save(employee3);
    		session.save(employee4);
            session.save(employee5);
    		session.save(employee6);
    		session.save(employee7);
    		session.save(employee8);
    		
    		
    		
    		DeptLocationId d1 = new DeptLocationId(department1,"Houston");
    	    DeptLocationId d2 = new DeptLocationId(department2,"Stafford");
    	    DeptLocationId d3 = new DeptLocationId(department3,"Bellaire");
    	    DeptLocationId d4 = new DeptLocationId(department2,"Sugarland");
    	    DeptLocationId d5 = new DeptLocationId(department3,"Houston");
    		
    		DeptLocations dlocation1 = new DeptLocations(d1);
    	    DeptLocations dlocation2 = new DeptLocations(d2);
    	    DeptLocations dlocation3 = new DeptLocations(d3);
    	    DeptLocations dlocation4 = new DeptLocations(d4);
    	    DeptLocations dlocation5 = new DeptLocations(d5);
    	    
    	    session.save(dlocation1);
    	    session.save(dlocation2);
    	    session.save(dlocation3);
    	    session.save(dlocation4);
    	    session.save(dlocation5);   
    		
    		Project project1 = new Project("Product X", "Bellaire", department1);
    	    Project project2 = new Project("Product Y", "Sugerland", department1);
    	    Project project3 = new Project("Product Z", "Houston", department1);
    	    Project project4 = new Project("Computerization", "Stafford", department2);
    	    Project project5 = new Project("Reorganization", "Houston", department3);
    	    Project project6 = new Project("Newbenefits", "Stafford", department2);
    	    
    	    session.save(project1);
    	    session.save(project2);
    	    session.save(project3);
    	    session.save(project4);
    	    session.save(project5);
    	    session.save(project6);
    	    
    	    DependentId dep1 = new DependentId(employee1, "Alica");
    	    DependentId dep2 = new DependentId(employee2,"Theodore");
    	    DependentId dep3 = new DependentId(employee3,"Joy");
    	    DependentId dep4 = new DependentId(employee4,"Abner");
    	    DependentId dep5 = new DependentId(employee5,"Alice");
    	    DependentId dep6 = new DependentId(employee6,"Alice");
    	    DependentId dep7 = new DependentId(employee7,"Elizabeth");  
    	   
    	    Dependent dependent1 = new Dependent(dep1, "F",date1, "Daughter");
            Dependent dependent2 = new Dependent(dep2, "M", date1, "Son");
            Dependent dependent3 = new Dependent(dep3, "F",date1, "Spouse");
            Dependent dependent4 = new Dependent(dep4,"M", date1,"Spouse");
            Dependent dependent5 = new Dependent(dep5, "M",date1, "Son");
            Dependent dependent6 = new Dependent(dep6,"F",date1, "Daughter");
            Dependent dependent7 = new Dependent(dep7,"F",date1,  "Spouse");
            
            session.save(dependent1);
            session.save(dependent2);
            session.save(dependent3);
            session.save(dependent4);
            session.save(dependent5);
            session.save(dependent6);
            session.save(dependent7);
            
            WorksOnId woi1 = new WorksOnId(employee1,project1);
    	    WorksOnId woi2 = new WorksOnId(employee2,project2);
            WorksOnId woi3 = new WorksOnId(employee5,project3);
            WorksOnId woi4 = new WorksOnId(employee6,project1);
            WorksOnId woi5 = new WorksOnId(employee6,project2);
            WorksOnId woi6 = new WorksOnId(employee4,project2);
            WorksOnId woi7 = new WorksOnId(employee4,project3);
            WorksOnId woi8 = new WorksOnId(employee4,project4);
            WorksOnId woi9 = new WorksOnId(employee4,project5);
            WorksOnId woi10 = new WorksOnId(employee3,project6);
            WorksOnId woi11 = new WorksOnId(employee3,project4);
            WorksOnId woi12 = new WorksOnId(employee6,project4);
            WorksOnId woi13 = new WorksOnId(employee6,project6);
            WorksOnId woi14 = new WorksOnId(employee4,project6);
            WorksOnId woi15 = new WorksOnId(employee4,project1);
            WorksOnId woi16 = new WorksOnId(employee7,project5);
            
            WorksOn p1 = new WorksOn(woi1,32.50);
            WorksOn p2 = new WorksOn(woi2,7.5);
            WorksOn p3 = new WorksOn(woi3,40.0);
            WorksOn p4 = new WorksOn(woi4,20.0);
            WorksOn p5 = new WorksOn(woi5,20.0);
            WorksOn p6 = new WorksOn(woi6,10.0);
            WorksOn p7 = new WorksOn(woi7,10.0);
            WorksOn p8 = new WorksOn(woi8,10.0);
            WorksOn p9 = new WorksOn(woi9,10.0);
            WorksOn p10 = new WorksOn(woi10,30.0);
            WorksOn p11 = new WorksOn(woi11,10.0);
            WorksOn p12 = new WorksOn(woi12,35.0);
            WorksOn p13 = new WorksOn(woi13,5.0);
            WorksOn p14 = new WorksOn(woi14,20.0);
            WorksOn p15 = new WorksOn(woi15,15.0);
            WorksOn p16 = new WorksOn(woi16);
            
            session.save(p1);
            session.save(p2);
            session.save(p3);
            session.save(p4);
            session.save(p5);
            session.save(p6);
            session.save(p7);
            session.save(p8);
            session.save(p9);
            session.save(p10);
            session.save(p11);
            session.save(p12);
            session.save(p13);
            session.save(p14);
            session.save(p15);
            session.save(p16);
            
            tx.commit();
    		
            
        	   
        	cs.findAllEmployees(session);
        	
			System.out.println("------------------------");
			
        	cs.findAllDepartment(session);
        	
			System.out.println("------------------------");

        	cs.getEmployeeWorksAt(department2, session);
        	
			System.out.println("------------------------");

        	cs.getAllProjectsAt(department2,session);
           
          
            
                      
            
    		
    		
    	    
		} catch (Exception e) {
          System.out.println(e);		
          }
    	 
    }
    
}
