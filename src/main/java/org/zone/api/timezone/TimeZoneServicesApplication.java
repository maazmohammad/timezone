package org.zone.api.timezone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TimeZoneServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeZoneServicesApplication.class, args);
	}

}
