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

	// business logic
	public String doShopping(String[] items, float[] prices) {

		System.out.println("FlipKart.doShopping()");
		System.out.println("Implementation class is:" + courier.getClass().getName());
		System.out.println("Discount Amount:: " + discount);

		float billamt = 0;

		java.util.Random random = null;

		for (float price : prices) {
			billamt += price;

		}
		
		billamt=billamt-(discount/100.0f);
		random = new java.util.Random();
		int oid = random.nextInt(1000);
		String msg = courier.deliver(oid);

		return Arrays.toString(items) + " are purchased with prices" + Arrays.toString(prices) +"with BillAmount::"+billamt+"=====>"+msg;
	}
	@Override
	public String toString() {
		return "FlipKart [courier=" + courier + ", discount=" + discount + "]";
	}
}
