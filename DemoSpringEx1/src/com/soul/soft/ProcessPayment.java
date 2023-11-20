package com.soul.soft;

public class ProcessPayment {

	Icards payment = null;

	public ProcessPayment(Icards payment) {
		this.payment = payment;
	}

	public void setPayment(Icards payment) {
		this.payment = payment;
	}

	public boolean doPayment(Double bill) {
		return payment.paybills(bill);

	}

}
