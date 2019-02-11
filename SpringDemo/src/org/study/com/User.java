package org.study.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
	public static void main(String[] args) {
		/*Insurance status = new carInsurance();
		Insurance show = new bikeInsurance();
		System.out.println(status.showStatus());
		System.out.println(show.showStatus());*/
		//ApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");
		//If Beans.xml is inside src folder than 
		//FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("/SpringDemo/src/org/study/com/Beans.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Insurance status =  context.getBean("myInsurance", Insurance.class);
		System.out.println(status.showStatus());
		System.out.println(status);
		context.close();
	}

}