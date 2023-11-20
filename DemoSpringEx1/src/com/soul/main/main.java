package com.soul.main;

import com.soul.soft.AmexCard;
import com.soul.soft.CreditCard;
import com.soul.soft.ProcessPayment;

public class main {

	public static void main(String[] args) {
		
		  //constructor Injection
		  ProcessPayment pp=new ProcessPayment(new CreditCard());
				
		//Setter Injection 
	     //System.out.println("Setter is getting called");
		
          pp.setPayment(new AmexCard());		
		  boolean status=pp.doPayment(100.90);
		  
		if(status) {
			System.out.println("Payment Success");
			
		}
		else {
			System.out.println("Payment Failure");
		}
	}

}
