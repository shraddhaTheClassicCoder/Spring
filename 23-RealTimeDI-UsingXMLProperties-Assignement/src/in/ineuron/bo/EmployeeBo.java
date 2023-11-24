package in.ineuron.bo;

public class EmployeeBo {

	private Integer eid;
	private String ename;
	private Integer eage;
	private String eaddress;

	static {
		System.out.println("EmployeeBo .class file is loading...");
	}

	public EmployeeBo() {
		System.out.println("EmployeeBo is instantiated...");
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getEage() {
		return eage;
	}

	public void setEage(Integer eage) {
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
		return "EmployeeBo [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress + "]";
	}

}
