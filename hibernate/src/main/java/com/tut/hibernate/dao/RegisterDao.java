package com.tut.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import com.tut.hibernate.entity.UserRegistration;

public class RegisterDao {
	public void saveUser(UserRegistration userRegistration) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(UserRegistration.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(userRegistration);
		transaction.commit();
}

		


	
	
}
