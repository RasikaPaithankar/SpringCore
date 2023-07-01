package org.rasika.autowiredemo;

public class District {

	String districtName;
	Country country;
	public District() {
		super();
		System.out.println("3");
	}
	public District(String districtName , Country country) {
		super();
		System.out.println("4");
		this.districtName = districtName;
		this.country = country;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "District [districtName=" + districtName + ", country=" + country + "]";
	}
}
