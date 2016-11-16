package com.onetomany.OneToMany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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
		saveMarket(s1);
		t.commit();
		
		readMarket(s1);
		//updateMarket(s1);
		
		deleteMarket(s1);
		s1.close();
	}
	
	public static void saveMarket(Session session)
	{
		Market m = new Market("Xoriant");
		
		Stock s1 = new Stock("NIFTY", 100);
		Stock s2 = new Stock("Other", 200);
		
		s1.setMarket(m);
		s2.setMarket(m);
		
		m.setStocks(new HashSet<Stock>());
		m.getStocks().add(s1);
		m.getStocks().add(s2);
		
		session.save(m);
		System.out.println("m market object saved ");
	}
	public static void readMarket(Session session)
	{
		Query query = session.createQuery("from Market");
		Iterator itr = query.list().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//session.close();
	}
	public static void updateMarket(Session session)
	{
		Market m = session.load(Market.class, 53L);
		Transaction t = session.beginTransaction();
		m.setName("Xoriant");
		//m.setId(100L);
		//session.save(m);
		session.update(m);
		t.commit();
		//session.close();
	}
	public static void deleteMarket(Session session)
	{
		Transaction t = session.beginTransaction();
		//session.delete(Market.class);
		//session.save(object)
		Query query = session.createQuery("drop table Market");
		query.executeUpdate();
		t.commit();
		
	}
	
}
