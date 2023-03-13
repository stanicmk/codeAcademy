package org.test.student;
import java.util.List;
import java.util.Set;
public interface StudentDAO {
	
	
	public String createStudentTable();
	public String createStudent(Student student);
	public Set getAllStudents();
	public Student getStudentByIndeks(String index);
	public List<Student> getStudentByMajor(String major);
	public List<StudentInfo> getStudentInfo();
	
	public String countStudents();
	

}
