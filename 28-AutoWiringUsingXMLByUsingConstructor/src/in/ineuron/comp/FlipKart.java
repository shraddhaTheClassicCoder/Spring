package in.ineuron.comp;

import java.util.Arrays;

public class FlipKart {

	// Dependant object
	private Courier courier;
	private Float discount;

	int Random = 0;

	static {
		System.out.println("FlipKart .class file is loading...");
	}

	public FlipKart() {
		System.out.println("Zero Param Constructor::");
	}

	public FlipKart(Courier courier, Float discount) {

		this.courier = courier;
		this.discount = discount;
		System.out.println("2 Param Constructor");
	}

	@Override
	public String toString() {
		return "FlipKart [courier=" + courier + ", discount=" + discount + "]";
	}
}
