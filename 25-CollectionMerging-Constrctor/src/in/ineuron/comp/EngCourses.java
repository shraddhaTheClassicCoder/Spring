package in.ineuron.comp;

import java.util.Set;

public class EngCourses {

	private Set<String> subjects;


	public EngCourses(Set<String> subjects) {
		
		this.subjects = subjects;
	}


	@Override
	public String toString() {
		return "EngCourses [subjects=" + subjects + "]";
	}

}
