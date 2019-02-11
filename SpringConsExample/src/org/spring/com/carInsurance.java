package org.spring.com;

import java.util.List;

public class carInsurance implements Insurance {

	public carInsurance(List<String> members) {
		System.out.println("Hello World");
		for(String member : members) {
			System.out.println(member);
		}
	}
	@Override
	public String showStatus() {
		return "Hello world";
	}

}
