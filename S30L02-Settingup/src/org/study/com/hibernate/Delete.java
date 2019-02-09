package org.study.com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.study.com.hibernate.entity.Users;

public class Delete {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hiernate.cfg.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			Users user = new Users();
			session.beginTransaction();
			user = session.get(Users.class, 4);
			session.delete(user);
			session.getTransaction().commit();
		} finally {
			factory.close();
			session.close();
		}
	}

}
