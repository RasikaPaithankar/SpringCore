package org.rasika.autowiredemo;

import java.util.List;

public class Country {

	String countryName;
	List<Territory> territories;
	
//	public Country() {
//		super();
//	}
//	public Country(String countryName) {
//		super();
//		countryName = countryName;
//	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public List<Territory> getTerritories() {
		return territories;
	}
	public void setTerritories(List<Territory> territories) {
		this.territories = territories;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", territories=" + territories + "]";
	}
}
