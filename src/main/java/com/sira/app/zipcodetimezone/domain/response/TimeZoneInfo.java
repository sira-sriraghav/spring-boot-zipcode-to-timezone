package com.sira.app.zipcodetimezone.domain.response;

public class TimeZoneInfo {

	private String timezoneId;

	public String getTimezoneId() {
		return timezoneId;
	}

	public void setTimezoneId(String timezoneId) {
		this.timezoneId = timezoneId;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}
