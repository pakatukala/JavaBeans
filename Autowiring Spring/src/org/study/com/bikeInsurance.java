package org.study.com;

public class bikeInsurance implements Insurance {
	public bikeInsurance(Offers offer) {
		System.out.println(offer.getOffer());
	}
	public bikeInsurance() {
	}

	@Override
	public String showStatus() {
		return "Your Bike is Insured";
	}
}
