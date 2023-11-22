package in.ineuron.vo;
//Customer Vo -  used to take the inputs from the customer in the form of string only
public class CustomerVo {

	private String customerName;
	private String customerAddress;
	private String pamt;
	private String rate;
	private String time;
	
	static {
		System.out.println("CustomerVo .class file loading...");
	}
	
	public CustomerVo() {
		System.out.println("CustomerVo object is instatiated...");
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getPamt() {
		return pamt;
	}

	public void setPamt(String pamt) {
		this.pamt = pamt;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "CustomerVo [customerName=" + customerName + ", customerAddress=" + customerAddress + ", pamt=" + pamt
				+ ", rate=" + rate + ", time=" + time + "]";
	}
	
	
}
