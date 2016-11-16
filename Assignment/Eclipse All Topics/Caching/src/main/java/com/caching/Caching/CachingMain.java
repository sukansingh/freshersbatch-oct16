package com.caching.Caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CachingMain {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s1 = sf.openSession();
		Transaction t = s1.beginTransaction();
		
		Product p = new Product("Toy", 100);
		
		s1.persist(p);
		Product p1 = s1.get(Product.class, p.getId());
		Product p2 = s1.get(Product.class, p.getId());
		t.commit();
		s1.close();
		
		sf.getCache().evictEntity(Product.class, p.getId());
		
		Session s2 = sf.openSession();
		Product p3 = s2.get(Product.class, p.getId());
		s2.close();
	}

}
