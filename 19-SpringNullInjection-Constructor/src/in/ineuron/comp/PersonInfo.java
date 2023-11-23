package in.ineuron.comp;

import java.util.Date;

public class PersonInfo {

	private Integer pid;
	private String Pname;
	private String paddrss;
	private Date dob;
	private Date doj;
	private Date dom;

	public PersonInfo(Integer pid, String pname, String paddrss, Date dob, Date doj, Date dom) {
		super();
		this.pid = pid;
		Pname = pname;
		this.paddrss = paddrss;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}

	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", Pname=" + Pname + ", paddrss=" + paddrss + ", dob=" + dob + ", doj=" + doj
				+ ", dom=" + dom + "]";
	}

}
