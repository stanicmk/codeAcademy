package org.test1.dbCompany;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        DbCompanyDAO dao = new DbCompanyDAOImpl();
        
        Department departement4 = new Department("IT", 3, 123459876, 25-11-2001);
        
        dao.insertDeparmtentinDb(departement4);
        
        
    }
}
