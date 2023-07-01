package org.rasika.LeadToSpring;

import org.springframework.stereotype.Component;

@Component
public class School {

	int wandNumber;
	String schoolName;
	Boolean isGoverment;
	
	public int getWandNumber() {
		return wandNumber;
	}

	public void setWandNumber(int wandNumber) {
		this.wandNumber = wandNumber;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Boolean getIsGoverment() {
		return isGoverment;
	}

	public void setIsGoverment(Boolean isGoverment) {
		this.isGoverment = isGoverment;
	}

	@Override
	public String toString() {
		return "School [wandNumber=" + wandNumber + ", schoolName=" + schoolName + ", isGoverment=" + isGoverment + "]";
	}
	
	public void Attendant() {
		System.out.println("Attendants should be greater than 75%");
	}
}
