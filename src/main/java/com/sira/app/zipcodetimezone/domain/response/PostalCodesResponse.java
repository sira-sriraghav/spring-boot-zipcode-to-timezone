package com.sira.app.zipcodetimezone.domain.response;

import java.util.List;

import com.sira.app.zipcodetimezone.domain.Postalcodes;

public class PostalCodesResponse {

	private List<Postalcodes> postalcodes;

	public void setPostalcodes(List<Postalcodes> postalcodes) {
		this.postalcodes = postalcodes;
	}

	public List<Postalcodes> getPostalcodes() {
		return this.postalcodes;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}
