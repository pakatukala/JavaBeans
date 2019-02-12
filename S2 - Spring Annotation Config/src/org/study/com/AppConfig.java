package org.study.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
	
	//This is the Oject of the particular class
	@Bean
	public BikeInsurance myInsurance() {
		return new BikeInsurance();
	}
}
