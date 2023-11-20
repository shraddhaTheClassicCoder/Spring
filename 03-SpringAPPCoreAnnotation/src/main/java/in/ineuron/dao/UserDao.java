package in.ineuron.dao;

import org.springframework.stereotype.Repository;

@Repository()
public class UserDao {

	public UserDao() {
		System.out.println("UserDao Object is created...");
}
	
	
	public boolean save() {
		
		System.out.println("Saved in db");
		return true;
	}
}