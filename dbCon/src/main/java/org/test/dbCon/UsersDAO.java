package org.test.dbCon;

import java.util.List;

public interface UsersDAO {
	
	public String insertUserinDB(Korisnik user);
	public List<Korisnik> getAllUsers();
	public Korisnik getUserById(Integer id);
	
	public String insertUserInDBwithPreparedStatemet(Korisnik user);

}
