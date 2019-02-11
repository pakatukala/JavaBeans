package org.study.com;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("/WebContent/Beans.xml");
		Offers offer1 = (Offers)context.getBean("offers");
		System.out.println(offer1.getOffer());
		offer1.setOffer("20 % off on your next purchase");
		System.out.println("Offer 1 : "+offer1.getOffer());
		Offers offer2 = (Offers)context.getBean("offers");
		System.out.println("Offer 2 : "+offer2.getOffer());
		System.out.println(offer1);
		System.out.println(offer2);
		context.close();
	}

}