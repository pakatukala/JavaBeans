package org.study.com;

import org.springframework.beans.factory.annotation.Autowired;

public class BikeInsurance implements Insurance {
	@Autowired
	public BikeInsurance(Offers offer) {
		System.out.println(offer.getOffer());
	}
	@Override
	public String showStatus() {
		return "Your Bike is Insured";
	}
	
}
