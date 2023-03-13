package org.test.dbCon;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        UsersDAO dao = new UsersDAOImpl();
        
      //  Korisnik user1 = new Korisnik(1, "Aleksandar", "alex@gmail", "123456");
        
      //  dao.insertUserinDB(user1);
        
        List<Korisnik> allUsers = new ArrayList<>();
        allUsers = dao.getAllUsers();
        
       // System.out.println("All users from db: " + allUsers.toString());
        
        Korisnik user2 = new Korisnik();
        user2 = dao.getUserById(2);
        
        System.out.println(user2.getName());
        
        
        Korisnik user3 = new Korisnik(4, "Martin", "martin@gmail", "098765");
        System.out.println(dao.insertUserInDBwithPreparedStatemet(user3));
    }
}
