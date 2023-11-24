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

	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("FlipKart.setCourier()");
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
		System.out.println("FlipKart.setDiscount()");
	}

	@Override
	public String toString() {
		return "FlipKart [courier=" + courier + ", discount=" + discount + "]";
	}
}
