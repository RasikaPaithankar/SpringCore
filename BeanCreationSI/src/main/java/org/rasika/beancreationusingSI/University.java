package org.rasika.beancreationusingSI;

import java.util.List;

public class University {

	String universityName;
	List<String> streams;
	List<Department> department;
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public List<String> getStreams() {
		return streams;
	}
	public void setStreams(List<String> streams) {
		this.streams = streams;
	}
	public List<Department> getDepartment() {
		return department;
	}
	public void setDepartment(List<Department> department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "University [universityName=" + universityName + ", streams=" + streams + ", department=" + department
				+ "]";
	}
}
