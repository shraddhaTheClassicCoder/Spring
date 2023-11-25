package in.ineuron.comp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="bDart")
@Primary
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
