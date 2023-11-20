package com.citi.MainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.citi.controller.CreditCard;
import com.citi.controller.DebitCard;
import com.citi.controller.PaymentProcess;

public class Main {
	public static void main(String[] args) {
     
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		/*
		 * context.getBean("credit",CreditCard.class);
		 * context.getBean("debit",DebitCard.class);
		 */
		
		PaymentProcess process=context.getBean("payment",PaymentProcess.class);
		process.doBill(200.23);
		
	}
}
