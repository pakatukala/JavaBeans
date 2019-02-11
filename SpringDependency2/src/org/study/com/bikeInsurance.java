package org.study.com;

public class bikeInsurance implements Insurance {
	private Offers CurrentOffer;
	public Offers getCurrentOffer() {
		return CurrentOffer;
	}
	public void setCurrentOffer(Offers currentOffer) {
		CurrentOffer = currentOffer;
	}
	@Override
	public String showStatus() {
		return "Your Bike is Insured";
	}
}
