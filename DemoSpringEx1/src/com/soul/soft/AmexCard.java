package com.soul.soft;

public class AmexCard implements Icards {

	@Override
	public boolean paybills(double bill) {
		System.out.println("The Bill paid using AmexCard:: " + bill);
		return true;
	}

}
