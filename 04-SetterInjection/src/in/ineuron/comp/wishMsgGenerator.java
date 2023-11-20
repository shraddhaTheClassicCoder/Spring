package in.ineuron.comp;

import java.util.Date;

public class wishMsgGenerator {

	private Date date;

	static {
		System.out.println("wishMsgGenerator .class file is loading");
	}

	public wishMsgGenerator() {
		System.out.println("wishMsgGenerator class instantiated");
	}
	
	

	/*
	 * public void setDate(Date date) { this.date = date;
	 * System.out.println("Setter method is called to perform Setter injection...");
	 * }
	 */
	public String wishMsg(String userName) {

		int hours = date.getHours();

		if (hours < 12) {
			return "Good Morning::" + userName;
		} else if (hours < 16) {
			return "Good Afternoon::" + userName;

		} else if (hours < 20) {
			return "Good Evening::" + userName;

		} else

			return "Good Night" + userName;
	}

	@Override
	public String toString() {
		return "wishMsgGenerator [date=" + date + "]";
	}
	
	

}
