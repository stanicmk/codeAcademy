package org.test.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class StudentDAOImpl implements StudentDAO {

	@Override
	public String createStudentTable() {
		Connection conn = JDBCConfig.getConnection();
		String result = "";
		
		try {
			Statement stmt = conn.createStatement();
			String query = "CREATE TABLE public.student ("
					+ "indeks VARCHAR(10) NOT NULL,"
					+ "name VARCHAR(20),"
					+ "surname VARCHAR(30),"
					+ "addressId INTEGER,"
					+ "major VARCHAR(50),"
					+ "PRIMARY KEY(indeks),"
					+ "FOREIGN KEY(addressId) REFERENCES public.address(id)"
					+");";
			
			Boolean status = stmt.execute(query);
			if (!status) {
				result = "Table successfuly created";
			}else {
				result = "Table is not created";
			}
					
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
			
			
	}

	@Override
	public String createStudent(Student student) {
		Connection conn = JDBCConfig.getConnection();
		String res = "";
		
		try {
			String query = "INSERT INTO public.student("
					+ "	indeks, name, surname, addressid, major)"
					+ "	VALUES (?, ?, ?, ?, ?);";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, student.getIndeks());
			ps.setString(2, student.getName());
			ps.setString(3, student.getSurname());
			ps.setInt(4, student.getAddressId());
			ps.setString(5, student.getMajor());
			
			ps.execute();
			
			res = "Student has been inserted";
			
		} catch (Exception e) {
			res = "Student has NOT been inserted";
			System.out.println(e);
		}
		
		return res;
	}

	@Override
	public Set getAllStudents() {
		
		Connection conn = JDBCConfig.getConnection();
		Set students = new HashSet();
		
		try {
			
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM public.student;";
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				Student student = new Student();
				
				student.setIndeks(rs.getString("indeks"));
				student.setName(rs.getString("name"));
				student.setSurname(rs.getString("surname"));
				student.setAddressId(rs.getInt("addressId"));
				student.setMajor(rs.getString("major"));
				
				students.add(student);
			}
			return students;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return students;
		
		
	}

	
		
	private Student extractStudentFromResultSet(ResultSet rs) throws SQLException {
		
		Student student = new Student();
		
		student.setIndeks(rs.getString("indeks"));
		student.setName(rs.getString("name"));
		student.setSurname(rs.getString("surname"));
		student.setAddressId(rs.getInt("address"));
		student.setMajor(rs.getString("major"));
		
		
		return student;
		
	}

	@Override
	public Student getStudentByIndeks(String indeks) {
		Connection conn = JDBCConfig.getConnection();
		Student student2 = new Student();
		
		try {
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM public.student  WHERE indeks='" + indeks + "';";
			ResultSet rs = stmt.executeQuery(query);
			
			if (rs.next()) {
				
				student2.setIndeks(rs.getString("indeks"));
				student2.setName(rs.getString("name"));
				student2.setSurname(rs.getString("surname"));
				student2.setAddressId(rs.getInt("addressId"));
				student2.setMajor(rs.getString("major"));
				
			}
				
				
		} catch (Exception e) {
			System.out.println(e);
			
		}
		
		return student2;
		
	}
		

	@Override
	public List<Student> getStudentByMajor(String major) {
		Connection con = JDBCConfig.getConnection();
		List<Student> result = new ArrayList<>();
		
		try {
			String query = "SELECT * FROM public.student WHERE major=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, major);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Student s = new Student();
				
				s.setIndeks(rs.getString("indeks"));
				s.setName(rs.getString("name"));
				s.setSurname(rs.getString("surname"));
				s.setAddressId(rs.getInt("addressId"));
				s.setMajor(rs.getString("major"));
				
				result.add(s);
			}
					
		} catch (Exception e) {
			System.out.println(e);
		}
			
		return result;
	}

	@Override
	public List<StudentInfo> getStudentInfo() {
		
		AddressDAO addDao = new AddressDAOImpl();
		
		List<StudentInfo> result = new ArrayList<>();
		
		Set<Student> allStudents = getAllStudents();
		
		for (Student student : allStudents) {
			StudentInfo sInfo = new StudentInfo();
			
			sInfo.setName(student.getName());
			sInfo.setSurname(student.getSurname());
			
			Address a = addDao.getAddressById(student.getAddressId());
			
			sInfo.setStreet(a.getStreet());
			sInfo.setNumber(a.getNumber());
			sInfo.setCity(a.getCity());
			
			result.add(sInfo);
			
		}
		
		return result;
		
	}

	@Override
	public String countStudents() {
		String i = "";
		Connection conn = JDBCConfig.getConnection();
		
		try {
			Statement stmt = conn.createStatement();
			
			String query = "SELECT COUNT(*) FROM public.student;";
			ResultSet rs = stmt.executeQuery(query);
			
			if(rs.next()) {
				i = rs.getString(1);
				System.out.println("Ima vkupno: " + rs.getString(1) + "studenti");
				
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
				
		
		return i;
		
	}

	
		
	

	
	

	

}	
	
		

