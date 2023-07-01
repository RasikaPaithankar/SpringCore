package org.rasika.LeadToSpring;

import org.springframework.stereotype.Component;

@Component
public class Teacher {

	int id;
	String tFirstName;
	String tLastName;
	String subExpert;
	
	public Teacher() {
		System.out.println("no-arg constructor-Teacher");
	}

	public Teacher(int id, String tFirstName, String tLastName, String subExpert) {
		super();
		this.id = id;
		this.tFirstName = tFirstName;
		this.tLastName = tLastName;
		this.subExpert = subExpert;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String gettFirstName() {
		return tFirstName;
	}

	public void settFirstName(String tFirstName) {
		this.tFirstName = tFirstName;
	}

	public String gettLastName() {
		return tLastName;
	}

	public void settLastName(String tLastName) {
		this.tLastName = tLastName;
	}

	public String getSubExpert() {
		return subExpert;
	}

	public void setSubExpert(String subExpert) {
		this.subExpert = subExpert;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", tFirstName=" + tFirstName + ", tLastName=" + tLastName + ", subExpert="
				+ subExpert + "]";
	}
	
}
