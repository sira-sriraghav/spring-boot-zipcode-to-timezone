package com.sira.app.zipcodetimezone.domain.request;

public class ZipCodeRequest {

	private String zipcode;

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}

}
