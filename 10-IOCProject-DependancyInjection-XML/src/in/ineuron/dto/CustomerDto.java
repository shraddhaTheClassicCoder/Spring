package in.ineuron.dto;
//Customer Dto is used is for processing the data
public class CustomerDto {

	private String customerName;
	private String customerAddress;
	private Float pamt;
	private Float rate;
	private Float time;
	
	private Float instrAmt;
	

	static {
		System.out.println("CustomerDto .class file is loading...");
	}
	
	public CustomerDto() {
		System.out.println("CustomerDto class is instatiated...");
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

	public Float getPamt() {
		return pamt;
	}

	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public Float getTime() {
		return time;
	}

	public void setTime(Float time) {
		this.time = time;
	}

	public Float getInstrAmt() {
		return instrAmt;
	}

	public void setInstrAmt(Float instrAmt) {
		this.instrAmt = instrAmt;
	}

	@Override
	public String toString() {
		return "CustomerDto [customerName=" + customerName + ", customerAddress=" + customerAddress + ", pamt=" + pamt
				+ ", rate=" + rate + ", time=" + time + ", instrAmt=" + instrAmt + "]";
	}
	
	
	
}
