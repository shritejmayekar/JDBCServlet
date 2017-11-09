package com.bridgelabz.programs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		Employee employee=new Employee();
		
		employee.setFirstName("piyush");
		employee.setLastName("taquala");
		session.persist(employee);
		transaction.commit();
		session.close();
		System.out.println("data inserted");
	}

}
