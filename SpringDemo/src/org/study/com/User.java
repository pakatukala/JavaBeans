package org.study.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/SpringDemo/Beans.xml");
		Insurance status =  context.getBean("myInsurance", Insurance.class);
		System.out.println(status.showStatus());
		System.out.println(status);
		context.close();
	}

}