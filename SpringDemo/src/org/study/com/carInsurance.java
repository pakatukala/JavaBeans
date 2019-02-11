package org.study.com;

public class carInsurance implements Insurance {
	private String name;
	private int insuranceID;
	
	public carInsurance() {
	}
	public carInsurance(String name, int insuranceID) {
		super();
		this.name = "User";
		this.insuranceID = 000;
	}
	@Override
	public String showStatus() {
		
		return  "Hi "+name+", your car is insured.  Your Insurance ID is : " +insuranceID;
	}

	@Override
	public int getValidity() {
		// TODO Auto-generated method stub
		return 0;
	}

}
