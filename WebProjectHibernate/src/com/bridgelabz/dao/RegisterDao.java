package com.bridgelabz.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.bridgelabz.model.RegisterPerson;

public class RegisterDao {

	public int addPerson(String firstName, String lastName, String password, String email, String birth, String mobile,
			String remail, String location) {
		AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
		Session sessionFactory = annotationConfiguration.configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		int i = 0;

		Transaction transaction = null;
		RegisterPerson registerPerson = new RegisterPerson();
		try {

			transaction = sessionFactory.beginTransaction();
			registerPerson.setFirstName(firstName);
			registerPerson.setLastName(lastName);
			registerPerson.setRemail(remail);
			registerPerson.setPassword(password);
			registerPerson.setEmail(email); 
			registerPerson.setBirth(birth);
			registerPerson.setMobile(mobile);
			registerPerson.setLocation(location);
			i = (int) sessionFactory.save(registerPerson);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction != null)
				transaction.rollback();
		} finally {
			sessionFactory.close();
		}

		return i;

	}

}
