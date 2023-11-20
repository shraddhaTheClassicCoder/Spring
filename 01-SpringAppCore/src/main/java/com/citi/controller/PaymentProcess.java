package com.citi.controller;

public class PaymentProcess {

	private IPay pay;

	public PaymentProcess(IPay pay) {
		System.out.println("PaymentProcess Object created by IOC Container");
		this.pay = pay;

	}

	public void setPay(IPay pay) {

		this.pay = pay;
	}

	public void doBill(double bill) {
		boolean status = pay.payBill(bill);

		if (status) {
			System.out.println("Payment Success");
		} else {
			System.out.println("Payment Failed");
		}
	}
}
