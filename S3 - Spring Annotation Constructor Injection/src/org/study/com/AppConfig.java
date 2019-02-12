package org.study.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
	@Bean
	public Offer currentOffer() {
		return new Offer();
	}
	//This is the Oject of the particular class
	@Bean("myInsurance")
	public BikeInsurance myInsurance() {
		return new BikeInsurance(currentOffer());
	}
}
