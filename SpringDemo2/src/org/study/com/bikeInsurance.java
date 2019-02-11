package org.study.com;

public class bikeInsurance implements Insurance {
	
	@Override
	public String showStatus() {
		
		return "Hi  your bike is insured";
	}
	public void start() {
		System.out.println("Started");
	}
	public void end() {
		System.out.println("Ended");
	}
}
