package in.ineuron.comp;

import java.util.Date;
import java.util.List;

public class College {

	private List<String> studentName;
	private List<Date> dateList;

	public College() {
		// TODO Auto-generated constructor stub
	}

	
	public void setStudentName(List<String> studentName) {
		this.studentName = studentName;
		System.out.println("Implementation Class is::"+studentName.getClass().getName());
	}


	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}

	@Override
	public String toString() {
		return "College [studentName=" + studentName + ", dateList=" + dateList + "]";
	}

}
