package in.ineuron.comp;

public class FirstFlight implements Courier {

	static {
		System.out.println("FirstFlight .class file loading...");
	}

	public FirstFlight() {
		System.out.println("FirstFlight Zero param constructor ");

	}

	@Override
	public String deliver(int oid) {

		return "The FirstFlight courier got selected with order id:" + oid+"for ordered products";
	}

}
