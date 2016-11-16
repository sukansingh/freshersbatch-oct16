package com.onetoone.OneToOne;

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
		saveCustomer(s1);
		t.commit();
		s1.close();
		
		
	}
	
	public static void saveCustomer(Session session)
	{
		Enquiry e = new Enquiry("service not work!!!");
		Customer c = new Customer("Tom",e);
		session.persist(c);
		System.out.println("c object saved ");
	}
	
}
