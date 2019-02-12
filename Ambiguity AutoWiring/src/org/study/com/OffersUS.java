package org.study.com;

import org.springframework.stereotype.Component;

@Component("offersUS")
public class OffersUS implements Offers{

	@Override
	public String getOffer() {
		// TODO Auto-generated method stub
		return "Get 10% of on your next purchase";
	}

}
