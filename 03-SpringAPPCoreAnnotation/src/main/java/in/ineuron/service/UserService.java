package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	
	public UserService() {
		System.out.println("UserService object is created...");
	}
	
	public void saveDb() {
		
		boolean status=dao.save();
		
		if(status)
		{
			System.out.println("Saving Successful");
		}
		else {
			System.out.println("Saving failed");
		}
	}
}
