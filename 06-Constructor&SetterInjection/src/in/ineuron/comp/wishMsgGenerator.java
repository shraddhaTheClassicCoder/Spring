package in.ineuron.comp;

import java.util.Date;

public class wishMsgGenerator {

	private Date date;

	static {
		System.out.println("wishMsgGenerator .class file is loading");
	}

	public wishMsgGenerator() {
		System.out.println("WishMessageGenerator object is instantiated using :: Zero param constructor");
	}

	public wishMsgGenerator(Date date) {

		this.date = date;
		System.out.println("wishMsgGenerator class instantiated :one args constructor is initiated");
		System.out.println(this);
	}

	public void setDate(Date date) {
		this.date = date;
		System.out.println("Setter method is called to perform Setter injection...");
		System.out.println(this);
	}

	

	@Override
	public String toString() {
		return "wishMsgGenerator [date=" + date + "]";
	}

}
