package in.ineuron.comp;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

public class UniversityInfo {

	private Map<Integer, String> facultyInfo;
	private Map<String, Date> dateInfo;
	private Properties iplInfo;

	public UniversityInfo() {
		// TODO Auto-generated constructor stub
	}

	public void setFacultyInfo(Map<Integer, String> facultyInfo) {
		this.facultyInfo = facultyInfo;
	}

	public void setDateInfo(Map<String, Date> dateInfo) {
		this.dateInfo = dateInfo;
	}

	public void setIplInfo(Properties iplInfo) {
		this.iplInfo = iplInfo;
	}

	@Override
	public String toString() {
		return "UniversityInfo [facultyInfo=" + facultyInfo + ", dateInfo=" + dateInfo + ", iplInfo=" + iplInfo + "]";
	}

}
