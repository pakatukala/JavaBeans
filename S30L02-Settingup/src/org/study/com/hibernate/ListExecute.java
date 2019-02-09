package org.study.com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.study.com.hibernate.entity.Users;

public class ListExecute {

	public static void main(String[] args) {
		SessionFactory factory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			//Write the Hibernate Query language
			//Start the transaction
			session.beginTransaction();
			List<Users> list = new ArrayList<>();
			session.createQuery("from user").list();
			for(Users temp : list) {
				System.out.println(temp);
			}
		} finally {
			factory.close();
			session.close();
			
		} 

	}

}
