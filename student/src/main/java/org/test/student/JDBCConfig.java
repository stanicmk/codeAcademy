package org.test.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConfig {
	
	static ConfigurationReader confReader = new ConfigurationReader();
	
	static String jdbcURL = confReader.getProperty("db.url");
			//"jdbc:postgresql://localhost:5432/student";
	static String jdbcUsername = confReader.getProperty("db.username");
			//"postgres";
	static String jdbcPassword = confReader.getProperty("db.password");
			//"postgres";
	
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
			getConnection();
			System.out.println("Successfully connected!");
		} catch (Exception e) {
			
			
		}
		
	}

}
