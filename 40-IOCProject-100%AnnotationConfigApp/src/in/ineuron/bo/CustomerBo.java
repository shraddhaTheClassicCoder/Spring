package in.ineuron.bo;

//CustomerBo object is used to process actual data which is required for persistance 
public class CustomerBo {

	private String customerName;
	private String customerAddress;
	private Float pamt;
	private Float rate;
	private Float time;
	
	private Float instrAmt;
	

	static {
		System.out.println("CustomerBo .class file is loading...");
	}

	public CustomerBo() {
		System.out.println("CustomerBo class is instatiated...");
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

	public void setTime(Float time) {
		this.time = time;
	}

	public Float getTime() {
		return time;
	}

	
	public Float getInstrAmt() {
		return instrAmt;
	}

	public void setInstrAmt(Float instrAmt) {
		this.instrAmt = instrAmt;
	}

	@Override
	public String toString() {
		return "CustomerBo [customerName=" + customerName + ", customerAddress=" + customerAddress + ", pamt=" + pamt
				+ ", rate=" + rate + ", time=" + time + ", instrAmt=" + instrAmt + "]";
	}
	
	

	}
