package in.ineuron.vo;

public class EmployeeVo {

	private String eid;
	private String ename;
	private String eage;
	private String eaddress;

	static {
		System.out.println("EmployeeVo .class file is loading...");
	}

	public EmployeeVo() {
		System.out.println("EmployeeVo is instantiated...");
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEage() {
		return eage;
	}

	public void setEage(String eage) {
		this.eage = eage;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	@Override
	public String toString() {
		return "EmployeeVo [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress + "]";
	}

}
