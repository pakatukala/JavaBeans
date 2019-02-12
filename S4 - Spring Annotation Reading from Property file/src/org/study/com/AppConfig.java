package org.study.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:org/study/properties/offersList.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer
	PropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
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
