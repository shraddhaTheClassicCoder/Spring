package in.ineuron.comp;

import java.util.Date;
import java.util.Map;

public class UniversityInfo {

	private Map<Integer, String> facultyInfo;
	private Map<String, Date> dateInfo;

	public UniversityInfo() {
		// TODO Auto-generated constructor stub
	}

	public void setFacultyInfo(Map<Integer, String> facultyInfo) {
		this.facultyInfo = facultyInfo;
	}

	public void setDateInfo(Map<String, Date> dateInfo) {
		this.dateInfo = dateInfo;
	}

	@Override
	public String toString() {
		return "UniversityInfo [facultyInfo=" + facultyInfo + ", dateInfo=" + dateInfo + "]";
	}

}
