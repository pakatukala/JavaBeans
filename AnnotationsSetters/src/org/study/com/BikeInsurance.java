package org.study.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myInsurance")
public class BikeInsurance implements Insurance {
	@Autowired
	Offers currentOffer;
	@Override
	public String showStatus() {
		return "Your Bike is Insured";
	}
	@Override
	public Offers getCurrentOffer() {
		return currentOffer;
	}
	//We can avoid the setter method using field Injection
	//NO need to use the setter method instead we @Autowire the object of the class

}
