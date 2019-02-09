package org.study.com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.study.com.hibernate.entity.Users;

public class Send {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			Users user = new Users("pavan", "12345", "pavan", "katukala");
			//start transaction
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			System.out.println("Rows Added");
		} finally {
			session.close();
			factory.close();
		}
	}

}
