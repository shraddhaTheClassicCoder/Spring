package in.ineuron.dto;

public class EmployeeDTO {

	private String ename;
	private Integer eage;
	private String eaddress;
	private Float esalary;
	private Float hikeAmount;

	public Float getEsalary() {
		return esalary;
	}

	public void setEsalary(Float esalary) {
		this.esalary = esalary;
	}

	public Float getHikeAmount() {
		return hikeAmount;
	}

	public void setHikeAmount(Float hikeAmount) {
		this.hikeAmount = hikeAmount;
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
		return "EmployeeDTO [ ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress
				+ ", esalary=" + esalary + ", hikeAmount=" + hikeAmount + "]";
	}

}
