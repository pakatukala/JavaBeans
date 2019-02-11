package org.study.com;

import java.util.List;

public class bikeInsurance implements Insurance {
	public bikeInsurance(List<String> members) {
		for(String member : members) {
			System.out.println(member);
		}
	}
	@Override
	public String showStatus() {
		return "Your Bike is Insured";
	}
}
