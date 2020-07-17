package com.sira.app.zipcodetimezone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import com.sira.app.zipcodetimezone.domain.Postalcodes;
import com.sira.app.zipcodetimezone.domain.TimeZone;
import com.sira.app.zipcodetimezone.domain.response.PostalCodesResponse;
import com.sira.app.zipcodetimezone.domain.response.TimeZoneInfo;

@Service
public class ZipcodeTimezoneService {

	@Value("${geonames.postcalcode.url}")
	private String postalCodeUrl;

	@Value("${geonames.timezone.url}")
	private String timezoneUrl;

	@Value("${geonames.username}")
	private String username;

	@Value("${geonames.country}")
	private String country;

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * It uses Geonames API to get longitude, latitude and timezone info. Create an
	 * account at "https://www.geonames.org/login". Then enable the account to use
	 * free web service after activation using the link
	 * "https://www.geonames.org/manageaccount". for web service operations visit -
	 * "https://www.geonames.org/export/ws-overview.html" For preminum webservices
	 * visit - https://www.geonames.org/products/premium-data.html
	 * 
	 * @param zipCode
	 * @return timezone
	 */
	public ResponseEntity<TimeZoneInfo> timeZoneInfo(String zipCode) {
		TimeZoneInfo timeZoneInfo = new TimeZoneInfo();
		ResponseEntity<PostalCodesResponse> postalCodesResponse = restTemplate.exchange(
				new StringBuilder(postalCodeUrl).append("postalcode=").append(zipCode).append("&country=")
						.append(country).append("&username=").append(username).toString(),
				HttpMethod.GET, null, PostalCodesResponse.class);
		if (postalCodesResponse.getStatusCodeValue() == 200) {
			List<Postalcodes> postalcodes = postalCodesResponse.getBody().getPostalcodes();
			if (!CollectionUtils.isEmpty(postalcodes)) {
				Postalcodes postalcode = postalcodes.get(0);
				String lat = String.valueOf(postalcode.getLat());
				String lng = String.valueOf(postalcode.getLng());
				ResponseEntity<TimeZone> timeZone = restTemplate.exchange(
						new StringBuilder(timezoneUrl).append("lat=").append(lat).append("&lng=").append(lng)
								.append("&username=").append(username).toString(),
						HttpMethod.GET, null, TimeZone.class);
				if (timeZone.getStatusCodeValue() == 200) {
					String zoneId = timeZone.getBody().getTimezoneId();
					timeZoneInfo.setTimezoneId(java.util.TimeZone.getTimeZone(zoneId).getDisplayName());
				}
			}
		}
		return new ResponseEntity<>(timeZoneInfo, HttpStatus.CREATED);
	}
}
