package in.ineuron.comp;

public class Student {

	private Integer sno;
	private String sname;
	private String saddr;
	private Float savg;

	public Student(Integer sno, String sname, String saddr, Float savg) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.saddr = saddr;
		this.savg = savg;

		System.out.println("Student::Using 4 Param Constructors");
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", saddr=" + saddr + ", savg=" + savg + "]";
	}
	
	

}
