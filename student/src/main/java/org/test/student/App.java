package org.test.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AddressDAO addressDAO = new AddressDAOImpl();
        	//addressDAO.createAddressTable();
        	//System.out.println(addressDAO.createAddressTable());
        	
        StudentDAO studentDAO = new StudentDAOImpl();
      		//studentDAO.createStudentTable();
      		//System.out.println(studentDAO.createStudentTable());
        
        Address add = new Address(3, "Juzen Bulevar", "37", "Skopje");
        	//System.out.println(addressDAO.createAddress(add));
        
        Student st1 = new Student("105/2021", "Jovan", "Trajkovski", add.getId(), "Computer Science");
        	//System.out.println(studentDAO.createStudent(st1));
       
       //StudentDAO dao =  new StudentDAOImpl();	
       // Set allStudents = new HashSet<>();
       //	allStudents = dao.getAllStudents();
       //	System.out.println(allStudents.toString());
        
        studentDAO.getAllStudents();
      
        Student s = studentDAO.getStudentByIndeks("101/2021");
        Address a = addressDAO.getAddressById(s.getAddressId());
      
        System.out.println("Student info:" + s.getIndeks() + ", " + s.getName() + "Addres info: " 
        		+ a.getCity() + ", " + a.getStreet() + ", " + a.getNumber()) ;
       
       
       
       List<Student> studentsWithSameMajor = studentDAO.getStudentByMajor("Computer Science");
       for (Student student : studentsWithSameMajor) {
    	  // System.out.println(student);
		
       }
       
       List<StudentInfo> studentsInfo = studentDAO.getStudentInfo();
       
       for (StudentInfo studentInfo : studentsInfo) {
    	  // System.out.println(studentInfo);
       }
       	
      // System.out.println(studentDAO.countStudents());
    }
       	
}
