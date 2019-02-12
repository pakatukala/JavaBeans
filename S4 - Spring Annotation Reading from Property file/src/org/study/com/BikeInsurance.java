package org.study.com;


public class BikeInsurance implements Insurance {
	
	Offer offer;
	
	public Offer getOffer() {
		return offer;
	}

	public BikeInsurance(Offer offer) {
		super();
		this.offer = offer;
	}

	@Override
	public String showStatus() {
		
		return "Hi your bike is insured.";
	}
	
}
