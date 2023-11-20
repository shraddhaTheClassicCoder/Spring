package com.citi.controller;

public class CreditCard implements IPay{

	
	public CreditCard() {
		System.out.println("CreditCard Object created by IOC Container");
	}
	
	@Override
	public boolean payBill(double Amt) {
	    
		System.out.println("Bill is Paid using CreditCard::"+Amt);
		
		return true;
	}

}
