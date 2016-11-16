package com.hibernate.HibernateProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUD_Operations_Sequence 
{
	public static void main(String args[])
	{
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		//Create with sequence
		
		Session s1 = sessionFactory.openSession();
		Transaction t = s1.beginTransaction();
		Product p = new Product("abc",800);
		s1.save(p);
		System.out.println(p.getId());
		t.commit();
		s1.close();
		
	}
	
	
}
