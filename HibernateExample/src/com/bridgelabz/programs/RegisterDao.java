package com.bridgelabz.programs;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class RegisterDao {
	
	
	
	public int addrecord(String name,String dept,String salary) {
		AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
		Session sessionFactory = annotationConfiguration.configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction transaction=null;
		Employee employee=new Employee();
		try {
			transaction=sessionFactory.beginTransaction();
			employee.setName(name);
			employee.setDept(dept);
			employee.setSalary(salary);
			int i=(int) sessionFactory.save(employee);
			transaction.commit();
			if(i>0)
				System.out.print("succes");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			if(transaction!=null)
				transaction.rollback();
		}finally {
			sessionFactory.close();
		}
		
		
		return 0;
		
		
	}

}
