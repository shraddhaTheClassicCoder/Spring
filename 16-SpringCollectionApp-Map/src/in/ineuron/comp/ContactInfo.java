package in.ineuron.comp;

import java.util.Date;
import java.util.Set;

public class ContactInfo {

	private Set<Long> phoneNumber;
	private Set<Date> dateList;

	public ContactInfo() {
		// TODO Auto-generated constructor stub
	}

	public void setPhoneNumber(Set<Long> phoneNumber) {
		this.phoneNumber = phoneNumber;

		System.out.println("The Implementation class is :: " + phoneNumber.getClass().getName());
	}

	public void setDateList(Set<Date> dateList) {
		this.dateList = dateList;
	}

	@Override
	public String toString() {
		return "ContactInfo [phoneNumber=" + phoneNumber + ", dateList=" + dateList + "]";
	}

}
