package org.rasika.LeadToSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	int rollNumber;
	int std;
	String studName;
	
	@Autowired
	School school;
	
	
	public Student() {
		System.out.println("no-arg constructor-Student");
	}

	public Student(int rollNumber, int std, String studName) {
		super();
		this.rollNumber = rollNumber;
		this.std = std;
		this.studName = studName;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}
	
	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public void printStudentDetails(Student s) {
		System.out.println("Roll is " + s.getRollNumber() + " Standard is " + s.getStd() + " Student name is " + s.getStudName());
	}
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", std=" + std + ", studName=" + studName + ", school=" + school
				+ "]";
	}
	
	
}
