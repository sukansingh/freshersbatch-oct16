package com.hibernate.HibernateProject;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUD_Operations 
{
	public static void main(String args[])
	{
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		//Create
		
		Session s1 = sessionFactory.openSession();
		Transaction t = s1.beginTransaction();
		Product p = new Product("Lapi",40000);
		s1.save(p);
		Long id = p.getId();
		t.commit();
		s1.close();
		
		/*
		//Update
		Session s2 = sessionFactory.openSession();
		Transaction t2 = s2.beginTransaction();
		Product p2 = s2.get(Product.class, id);
		//s2.load(Product.class, id);
		p2.setPrice(3000);
		s2.save(p2);
		t2.commit();
		s2.close();
		
		*/
		
		//READ
		Session s3 = sessionFactory.openSession();
		Query query = s3.createQuery("from Product");
		List prod = query.list();
		System.out.println(prod);
		s3.close();
		
		//DELETE
		Session s4 = sessionFactory.openSession();
		Transaction t4 = s4.beginTransaction();
		Product p4 = s4.load(Product.class, 18L);
		s4.delete(p4);
		s4.save(p4);
		t4.commit();
		
		
		//READ
				Session s5 = sessionFactory.openSession();
				Query query5 = s5.createQuery("from Product");
				List prod5 = query5.list();
				System.out.println(prod5);
				s5.close();
		
		
		
		
	}
	
	
}
