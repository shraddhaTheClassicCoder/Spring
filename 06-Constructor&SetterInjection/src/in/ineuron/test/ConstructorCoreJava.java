package in.ineuron.test;

import java.util.Date;

import in.ineuron.comp.wishMsgGenerator;

public class ConstructorCoreJava {

	public static void main(String[] args) {
		
		Date date=new java.util.Date();
		System.out.println("Creating an Object of Dependant class using Zero param constructor :: " + date);

		wishMsgGenerator msg=new wishMsgGenerator(date);
		System.out.println("Creating an Object of Target class using one param constructor :: " + date);
		
		System.out.println(msg);
		
		//String status=msg.wishMsg("Shreya");
		
		//System.out.println(status);
		
	}

}
