package org.study.com.hibernate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.study.com.hibernate.entity.Files;

public class FilesDAO {
	
	SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Files.class)
			.buildSessionFactory();
	public void addFileDetails(Files file) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(file);
		session.getTransaction().commit();
		System.out.println(file.getFileName()+ " Got Added");
	}
	public List<Files> listFiles(){
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		//we wont get the entire list
		//session.get(Files.class, 1);
		//Return list of files
		//files reffered to the entity class
		List<Files> files = session.createQuery("from files").getResultList();
		//session.getTransaction().commit();
		return files;
		
	}
}
