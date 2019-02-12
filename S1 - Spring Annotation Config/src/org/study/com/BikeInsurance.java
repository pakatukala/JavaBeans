package org.study.com;

import org.springframework.stereotype.Component;

@Component("myInsurance")
public class BikeInsurance implements Insurance {
	
	
	@Override
	public String showStatus() {
		
		return "Hi your bike is insured.";
	}
	
}
