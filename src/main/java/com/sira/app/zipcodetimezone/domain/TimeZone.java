package com.sira.app.zipcodetimezone.domain;

public class TimeZone {

	private String sunrise;
	private double lng;
	private String countryCode;
	private int gmtOffset;
	private int rawOffset;
	private String sunset;
	private String timezoneId;
	private int dstOffset;
	private String countryName;
	private String time;
	private double lat;

	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	public String getSunrise() {
		return this.sunrise;
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

	public void setGmtOffset(int gmtOffset) {
		this.gmtOffset = gmtOffset;
	}

	public int getGmtOffset() {
		return this.gmtOffset;
	}

	public void setRawOffset(int rawOffset) {
		this.rawOffset = rawOffset;
	}

	public int getRawOffset() {
		return this.rawOffset;
	}

	public void setSunset(String sunset) {
		this.sunset = sunset;
	}

	public String getSunset() {
		return this.sunset;
	}

	public void setTimezoneId(String timezoneId) {
		this.timezoneId = timezoneId;
	}

	public String getTimezoneId() {
		return this.timezoneId;
	}

	public void setDstOffset(int dstOffset) {
		this.dstOffset = dstOffset;
	}

	public int getDstOffset() {
		return this.dstOffset;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTime() {
		return this.time;
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
