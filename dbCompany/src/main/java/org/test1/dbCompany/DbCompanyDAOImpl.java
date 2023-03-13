package org.test1.dbCompany;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbCompanyDAOImpl implements DbCompanyDAO {

	public String insertDeparmtentinDb(Department dbCompany) {
		
		String res = "";
		Connection dbConnection = JDBCConfig1.getConnection();
		
		try {
			Statement stmt = dbConnection.createStatement();
			
			String query = "INSERT INTO public.department("
					+ "dname, dnumber, mgrssn, mgrstartdate)"
					+ "VALUES ('" + dbCompany.getDname() + "'," + dbCompany.getDnumber() +
					"," + dbCompany.getMgrssn() + "," + dbCompany.getMgrstartdate() + ") ;";
			ResultSet rs = stmt.executeQuery(query);
			
			res = "Department has been inserted successfuly";
			
		} catch (Exception e) {
			res = "Department has not been inserted successfuly";
			System.out.println(e);
		}
		
		return res;
	}

}
