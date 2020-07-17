package com.sira.app.zipcodetimezone.domain;

public class Postalcodes {

	private String adminCode2;
	private String adminCode1;
	private String adminName2;
	private double lng;
	private String countryCode;
	private String postalcode;
	private String adminName1;
	private String placeName;
	private double lat;

	public void setAdminCode2(String adminCode2) {
		this.adminCode2 = adminCode2;
	}

	public String getAdminCode2() {
		return this.adminCode2;
	}

	public void setAdminCode1(String adminCode1) {
		this.adminCode1 = adminCode1;
	}

	public String getAdminCode1() {
		return this.adminCode1;
	}

	public void setAdminName2(String adminName2) {
		this.adminName2 = adminName2;
	}

	public String getAdminName2() {
		return this.adminName2;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public double getLng() {
		return this.lng;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getPostalcode() {
		return this.postalcode;
	}

	public void setAdminName1(String adminName1) {
		this.adminName1 = adminName1;
	}

	public String getAdminName1() {
		return this.adminName1;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceName() {
		return this.placeName;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLat() {
		return this.lat;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}
