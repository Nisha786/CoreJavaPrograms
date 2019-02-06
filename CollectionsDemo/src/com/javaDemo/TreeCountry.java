package com.javaDemo;

public class TreeCountry implements Comparable {

	String countryName;

	public TreeCountry(String countryName) {
		super();
		this.countryName = countryName;
	}

	@Override
	public int compareTo(Object arg0) {

		TreeCountry tc = (TreeCountry) arg0;
		return (this.countryName.compareTo(tc.countryName));
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
}