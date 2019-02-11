package org.study.com;

public class bikeInsurance implements Insurance {
	private String name;
	private int insuranceID;
	private int validity;

	public bikeInsurance(String name, int insuranceID) {
		this.name = name;
		this.insuranceID = insuranceID;
	}
	public int getValidity() {
		return validity;
	}

	public bikeInsurance() {
		this.name = "User";
		this.insuranceID = 000;
	}	
	@Override
	public String showStatus() {
		
		return "Hi "+name+", your bike is insured.  Your Insurance ID is : " +insuranceID;
	}
	@Override
	public String toString() {
		return "bikeInsurance [validity=" + validity + "]";
	}
	
	public void setValidity(int validity) {
		this.validity = validity;
	}
	
}
