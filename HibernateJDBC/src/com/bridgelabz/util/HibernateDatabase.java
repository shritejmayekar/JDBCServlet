package com.bridgelabz.util;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgelabz.programs.Employee;
/**
 * 
 * @author shritej
 *
 */
public class HibernateDatabase {
	/**
	 * Declaration
	 */
	public static SessionFactory factory;

	{
		factory = new Configuration().configure().buildSessionFactory();
	}

	public void insert(String firstName, String lastName) {
		int employeeID;
		Session session = null;
		Employee employee = new Employee();
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();

			employee.setFirstName(firstName);
			employee.setLastName(lastName);
			session.save(employee);
			// session.persist(employee);
			transaction.commit();
			System.out.println("Data insert Success");

		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
			System.out.println(e);
		} finally {
			session.close();
		}

	}

	public void show() {
		Session session = factory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			List employees = session.createQuery("from Employee").list();
			for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
				Employee employee = (Employee) iterator.next();
				System.out.println("Id:" + employee.getId() + " " + "fName:" + employee.getFirstName() + " " + "lName:"
						+ employee.getLastName());

			}
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
	}

	public void update(int id, String firstName) {
		Session session = factory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Employee employee = (Employee) session.get(Employee.class, id);
			employee.setFirstName(firstName);
			transaction.commit();
			System.out.println("Updated:" + id);
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction != null)
				transaction.rollback();

		} finally {
			session.close();
		}
	}
	public void delete(int id) {
		Session session=factory.openSession();
		Transaction transaction=null;
		try {
			transaction=session.beginTransaction();
			Employee employee=(Employee) session.get(Employee.class, id);
			session.delete(employee);
			transaction.commit();
			System.out.println("Record deleted id:"+id);
		} catch (Exception e) {
			// TODO: handle exception
			if(transaction!=null)
				transaction.rollback();
		}
		finally {
			session.close();
		}
	}

}
