package in.ineuron.comp;


public class BlueDart implements Courier {

	static {
		System.out.println("BlueDart .class file loading...");
	}
	
	public BlueDart() {
		System.out.println("BlueDart Zero param constructor");

	}
	@Override
	public String deliver(int oid) {
		
		 return "The FirstFlight courier got selected with order id:" + oid+"for ordered products";

	}

}
