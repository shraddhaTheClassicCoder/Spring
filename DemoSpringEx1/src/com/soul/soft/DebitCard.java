package com.soul.soft;

public class DebitCard implements Icards {

	@Override
	public boolean paybills(double bill) {
		System.out.println("The Bill paid using DebitCard:: " + bill);
		return true;
	}

}
