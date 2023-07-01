package org.rasika.autowiredemo;

import java.util.List;

public class State {

	String stateName;
	List<District> districtList;
	public State() {
		super();
	}
	public State(String stateName) {
		super();
		System.out.println("1");
		this.stateName = stateName;
	}
	public State(String stateName, List<District> districtList) {
		super();
		System.out.println("2");
		this.stateName = stateName;
		this.districtList = districtList;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public List<District> getDistrictList() {
		return districtList;
	}
	public void setDistrictList(List<District> districtList) {
		this.districtList = districtList;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", districtList=" + districtList + "]";
	}
}
