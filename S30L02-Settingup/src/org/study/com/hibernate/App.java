package org.study.com.hibernate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.study.com.hibernate.entity.Users;

public class App {
	
	public static void main(String[] args) {
		/*SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try {
			//create object for the entity class
			//Users user = new Users("username", "password", "first_name", "last_name");
			//Users user = new Users("pavan", "12345", "pavan", "katukala");
			Users user = new Users();
			//start transaction
			session.beginTransaction();
			//perform operation
			//session.save(user);
			user = session.get(Users.class, 4);
			//user.setUsername("pavan.katukala@gmail.com");
			session.delete(user);
			//commit the transaction
			session.getTransaction().commit();
			System.out.println(user);
		} finally {
			session.close();
			factory.close();
		}
		*/
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			//Write the Hibernate Query language
			//Start the transaction
			session.beginTransaction();
			List<Users> list = new ArrayList<Users>();
			session.createQuery("from user").getResultList();
			for(Users temp : list) {
				System.out.println(temp);
			}
		} finally {
			factory.close();
			session.close();
			
		} 
}
}
