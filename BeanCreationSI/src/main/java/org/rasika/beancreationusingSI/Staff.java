package org.rasika.beancreationusingSI;

import java.util.Map;

public class Staff {
	Teacher teacher;
	Map<Department,Administrator> adminMap;
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Map<Department, Administrator> getAdminMap() {
		return adminMap;
	}
	public void setAdminMap(Map<Department, Administrator> adminMap) {
		this.adminMap = adminMap;
	}
	@Override
	public String toString() {
		return "Staff [teacher=" + teacher + ", adminMap=" + adminMap + "]";
	}
}
