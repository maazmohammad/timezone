package org.zone.api.timezone.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;
import org.zone.api.timezone.controller.entity.TimeZone;

@RestController
public class TimeZoneServiceController {

	@GetMapping("/time")
	public ResponseEntity<TimeZone> getTimeZone(@RequestParam String zone) {
		RestTemplate restTemplate = new RestTemplate();

		try {
			ResponseEntity<TimeZone> timeZone = restTemplate
					.getForEntity("http://worldtimeapi.org/api/timezone/" + zone, TimeZone.class);
			return timeZone;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid zone");
		}
	}
}
