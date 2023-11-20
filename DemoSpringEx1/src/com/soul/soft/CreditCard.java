package com.soul.soft;

public class CreditCard implements Icards{

	@Override
	public boolean paybills(double bill) {
		System.out.println("The Bill paid using CreditCard:: " + bill);
		return true;
	}

}
