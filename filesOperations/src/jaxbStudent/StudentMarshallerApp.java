package jaxbStudent;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class StudentMarshallerApp {
	
	public static void main(String[] args) {
		
//		Student s = new Student();
		//Student1
		Student student1 = new Student();
		Address adresa = new Address();
		Phone phone = new Phone();
		ArrayList<String> emails = new ArrayList<>();
		ArrayList<Subject> subjects = new ArrayList<>();
		
		Subjects novSubjects = new Subjects();
		
		student1.setName("Aleksandar");
		student1.setSurname("Acev");
		student1.setIndex("123/2021");
		
		adresa.setCity("Strumica");
		adresa.setNumber(20);
		adresa.setStreet("Partizanska");
		
		student1.setAddress(adresa);
		
		phone.setHome("034123456");
		phone.setMobile("077123456");
		phone.setWork("034654321");
		
		student1.setPhone(phone);
		
		emails.add("aleksandar@email.com");
		emails.add("a.acev@gmail.com");
		emails.add("acev@email.com");
		
		student1.setEmails(emails);
		
		//subject 1
		Subject matematika1 = new Subject();
		
		matematika1.setName("Matematika 1");
		matematika1.setSchedule("Ponedelnik, Sreda, Petok");
		
		ArrayList<Book> knigi = new ArrayList<>();
		
		Book kniga1 = new Book();
		kniga1.setName("Funkcionalni redovi");
		kniga1.setAuthor("Goran Stanic");
		knigi.add(kniga1);
		
		matematika1.setBooks(knigi);
		
		Professor profMat = new Professor();
		profMat.setName("Aleksandar");
		profMat.setSurname("Smilevski");
		profMat.setEmail("asmilevski@email.com");
		
		matematika1.setProfessor(profMat);
		
		//subjects.add(matematika1);
		novSubjects.getSubjects().add(matematika1);
		
		//Subject 2
		Subject programiranje = new Subject();
		
		programiranje.setName("Programiranje 1");
		programiranje.setSchedule("Ponedelnik, Sreda");
		
		ArrayList<Book> knigiProgramiranje = new ArrayList<>();
		
		Book java = new Book();
		java.setName("Java fundamentals");
		java.setAuthor("Goran Stanic");
		knigiProgramiranje.add(java);
		
		programiranje.setBooks(knigiProgramiranje);
		
		Professor profProg = new Professor();
		profProg.setName("Dimitar");
		profProg.setSurname("Josifov");
		profProg.setEmail("jdimitar@gmail.com");
		
		programiranje.setProfessor(profProg);
		
		
		//subjects.add(programiranje);
		
		student1.setSubjects(novSubjects);
		novSubjects.getSubjects().add(programiranje);
		
		ArrayList<Grade> oceni = new ArrayList<>();
		
		Grade ocenaMat = new Grade();
		ocenaMat.setStudentIndex(student1.getIndex());
		ocenaMat.setSubject(matematika1);
		ocenaMat.setGrade(8);
		
		Grade ocenaProg = new Grade();
		ocenaProg.setStudentIndex(student1.getIndex());
		ocenaProg.setSubject(programiranje);
		ocenaProg.setGrade(10);
		
		oceni.add(ocenaMat);
		oceni.add(ocenaProg);
		
		student1.setGrades(oceni);
		
		Double gpa = prosek(student1.getGrades());
		student1.setGpa(gpa);
		
		System.out.println(student1.toString());
		
		//Student 2
		Student student2 = new Student();
		Address adresa2 = new Address();
		Phone phone2 = new Phone();
		ArrayList<String> emails2 = new ArrayList<>();
		//ArrayList<Subject> subjects2 = new ArrayList<>();
		Subjects novSubjects2 = new Subjects();
		
		
		student2.setName("Vlatko");
		student2.setSurname("Donchev");
		student2.setIndex("124/2021");
		
		adresa2.setCity("Skopje");
		adresa2.setNumber(21);
		adresa2.setStreet("Partizanska");
		
		student2.setAddress(adresa2);
		
		phone2.setHome("034123456");
		phone2.setMobile("077123456");
		phone2.setWork("034654321");
		
		student2.setPhone(phone2);
		
		emails2.add("vlatko@email.com");
		emails2.add("v.donchev@gmail.com");
		emails2.add("donchev@email.com");
		
		student2.setEmails(emails2);
		
		//subject 1
		Subject matematika2 = new Subject();
		
		matematika2.setName("Matematika 1");
		matematika2.setSchedule("Ponedelnik, Sreda, Petok");
		
		ArrayList<Book> knigi2 = new ArrayList<>();
		
		Book kniga2 = new Book();
		kniga2.setName("Funkcionalni redovi");
		kniga2.setAuthor("Goran Stanic");
		knigi2.add(kniga2);
		
		matematika2.setBooks(knigi);
		
		Professor profMat2 = new Professor();
		profMat2.setName("Aleksandar");
		profMat2.setSurname("Smilevski");
		profMat2.setEmail("asmilevski@email.com");
		
		matematika2.setProfessor(profMat2);
		
		//subjects2.add(matematika2);
		novSubjects2.getSubjects().add(matematika2);
		
		//Subject 2
		Subject programiranje2 = new Subject();
		
		programiranje2.setName("Programiranje 1");
		programiranje2.setSchedule("Ponedelnik, Sreda");
		
		ArrayList<Book> knigiProgramiranje2 = new ArrayList<>();
		
		Book java2 = new Book();
		java2.setName("Java fundamentals");
		java2.setAuthor("Goran Stanic");
		knigiProgramiranje2.add(java2);
		
		programiranje.setBooks(knigiProgramiranje2);
		
		Professor profProg2 = new Professor();
		profProg2.setName("Dimitar");
		profProg2.setSurname("Josifov");
		profProg2.setEmail("jdimitar@gmail.com");
		
		programiranje2.setProfessor(profProg2);
		
		
		//subjects2.add(programiranje2);
		novSubjects2.getSubjects().add(programiranje2);
		
		//student2.setSubjects(subjects2);
		student2.setSubjects(novSubjects2);
		
		
		ArrayList<Grade> oceni2 = new ArrayList<>();
		
		Grade ocenaMat2 = new Grade();
		ocenaMat2.setStudentIndex(student1.getIndex());
		ocenaMat2.setSubject(matematika1);
		ocenaMat2.setGrade(6);
		
		Grade ocenaProg2 = new Grade();
		ocenaProg2.setStudentIndex(student2.getIndex());
		ocenaProg2.setSubject(programiranje2);
		ocenaProg2.setGrade(7);
		
		oceni2.add(ocenaMat2);
		oceni2.add(ocenaProg2);
		
		student2.setGrades(oceni2);
		
		Double gpa2 = prosek(student2.getGrades());
		student2.setGpa(gpa2);
		
		System.out.println(student2.toString());
		
		Students s = new Students();
		s.getStudents().add(student1);
		s.getStudents().add(student2);
		
		
		try {
			JAXBContext context = JAXBContext.newInstance(Students.class);
			
			Marshaller jaxbMarshaller = context.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			jaxbMarshaller.marshal(s, new File("C:\\Users\\FFM CATAPULT\\Documents\\students.xml"));
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	private static Double prosek(ArrayList<Grade> grades) {
		Double gpa = 0.0;
		Integer sum = 0;
		
		for (Grade grade : grades) {
			sum = sum + grade.getGrade();
		}
		
		gpa = (double) (sum/grades.size());
		
		return gpa;
	}

}
