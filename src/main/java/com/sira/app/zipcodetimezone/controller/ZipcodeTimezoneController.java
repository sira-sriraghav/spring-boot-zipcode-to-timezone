package com.sira.app.zipcodetimezone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sira.app.zipcodetimezone.domain.request.ZipCodeRequest;
import com.sira.app.zipcodetimezone.domain.response.TimeZoneInfo;
import com.sira.app.zipcodetimezone.service.ZipcodeTimezoneService;

@RestController
@RequestMapping("/api")
public class ZipcodeTimezoneController {

	@Autowired
	private ZipcodeTimezoneService zipcodeTimezoneService;

	@PostMapping(path = "/timezone-details", consumes = { "application/json" }, produces = { "application/json" })
	public ResponseEntity<TimeZoneInfo> getTimeZoneInfo(@RequestBody ZipCodeRequest zipcodeRequest) {
		return zipcodeTimezoneService.timeZoneInfo(zipcodeRequest.getZipcode());
	}
}
