package org.study.com;

public class BikeInsurance implements Insurance {
	
	public String currentOffer;
	
	@Override
	public String showStatus() {
		
		return "Hi your bike is insured.";
	}
	public String getCurrentOffer() {
		return currentOffer;
	}
	public void setCurrentOffer(String currentOffer) {
		this.currentOffer = currentOffer;
	}
	
}
