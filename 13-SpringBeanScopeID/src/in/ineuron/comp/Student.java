package in.ineuron.comp;

public class Student {

	private String sid;
	private String sname;
	private String sddress;
	private String sage;
	
	
	static {
		System.out.println("Student .class is loading...");
	}


	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getSddress() {
		return sddress;
	}


	public void setSddress(String sddress) {
		this.sddress = sddress;
	}


	public String getSage() {
		return sage;
	}


	public void setSage(String sage) {
		this.sage = sage;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sddress=" + sddress + ", sage=" + sage + "]";
	}
	
	
}
