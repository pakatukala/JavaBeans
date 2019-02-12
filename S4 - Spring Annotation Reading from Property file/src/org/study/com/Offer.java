package org.study.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Offer {
	//@Value("${offers.IND}")
	public String currentOffer = "new Offers";

	public String getCurrentOffer() {
		return currentOffer;
	}
	@Autowired
	public void setCurrentOffer(@Value("${offers.IND}") String currentOffer) {
		this.currentOffer = currentOffer;
	}

}
