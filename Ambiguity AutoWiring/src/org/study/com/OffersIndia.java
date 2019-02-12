package org.study.com;

import org.springframework.stereotype.Component;
@Component("offerIndia")
public class OffersIndia implements Offers{
	//This is plain old Java Objects class
	@Override
	public String getOffer() {
		return "Get 20% of on your next purchase";
	}
}
