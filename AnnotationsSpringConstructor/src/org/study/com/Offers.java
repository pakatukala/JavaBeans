package org.study.com;

import org.springframework.stereotype.Component;
@Component("Offers")
public class Offers {
	//This is plain old Java Objects class
	public String getOffer() {
		return "Get 20% of on your next purchase";
	}
}
