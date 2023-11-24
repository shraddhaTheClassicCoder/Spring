package in.ineuron.comp;

public class DTDC implements Courier {

	static {
		System.out.println("DTDC .class file loading...)");
	}
	
	public DTDC() {
		
	System.out.println("DTDC Zero param constructor ");
	}
	
	@Override
	public String deliver(int oid) {
		
		return "The FirstFlight courier got selected with order id:" + oid+"for ordered products";

	}

}
