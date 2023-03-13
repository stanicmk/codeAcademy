package org.test1.dbCompany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConfig1 {
	
	private static String jdbcURL = "jdbc: postgresql://localhost:5432/companydb";
	private static String jdbcUsername = "postgres";
	private static String jdbcPassword = "postgres";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		
		return connection;
		
	}
	public static void main(String[] args) {
		try {
			
			Connection con = getConnection();
			System.out.println("Connected Successfully");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
