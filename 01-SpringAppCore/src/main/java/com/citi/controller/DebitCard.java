package com.citi.controller;

public class DebitCard implements IPay {

	public DebitCard() {
		System.out.println("DebitCard Object created by IOC Container");
	}

	@Override
	public boolean payBill(double Amt) {

		System.out.println("Bill is Paid using CreditCard::" + Amt);

		return true;
	}

}
