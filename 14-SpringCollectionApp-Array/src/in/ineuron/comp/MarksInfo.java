package in.ineuron.comp;

import java.util.Arrays;

public class MarksInfo {

	public int[] marksInfo;
	
	//Using Setter Injection Here 
	
	public MarksInfo() {
		// TODO Auto-generated constructor stub
	}


	public void setMarksInfo(int[] marksInfo) {
		this.marksInfo = marksInfo;
	}


	@Override
	public String toString() {
		return "MarksInfo [marksInfo=" + Arrays.toString(marksInfo) + "]";
	}
	
	
	
	
}
