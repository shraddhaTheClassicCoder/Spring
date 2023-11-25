package in.ineuron.comp;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="dtdc")
@Scope(scopeName = "prototype")
@Lazy(true)
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
