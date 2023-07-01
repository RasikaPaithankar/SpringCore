package org.rasika.beancreationusingSI;

import java.util.Map;

public class Teacher {

	int tId;
	String name;
	Map<Integer, String> subjectExpertTeacher;
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Integer, String> getSubjectExpertTeacher() {
		return subjectExpertTeacher;
	}
	public void setSubjectExpertTeacher(Map<Integer, String> subjectExpertTeacher) {
		this.subjectExpertTeacher = subjectExpertTeacher;
	}
	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", name=" + name + ", subjectExpertTeacher=" + subjectExpertTeacher + "]";
	}
}
