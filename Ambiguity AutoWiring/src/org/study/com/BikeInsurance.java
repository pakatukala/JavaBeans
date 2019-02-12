package org.study.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myInsurance")
public class BikeInsurance implements Insurance {
	@Autowired
	@Qualifier("offersUS")
	Offers Currentoffer;
	@Override
	public String showStatus() {
		return "Your Bike is Insured";
	}
	@Override
	public Offers getCurrentoffer() {
		return Currentoffer;
	}

}
