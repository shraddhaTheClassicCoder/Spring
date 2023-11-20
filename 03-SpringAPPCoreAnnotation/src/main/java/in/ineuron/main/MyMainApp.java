package in.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.dao.UserDao;
import in.ineuron.service.UserService;

public class MyMainApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		UserService service=context.getBean(UserService.class);
		service.saveDb();
		
	}
	
}
