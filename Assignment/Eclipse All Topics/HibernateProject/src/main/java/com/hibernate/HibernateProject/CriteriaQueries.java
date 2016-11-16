package com.hibernate.HibernateProject;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;

public class CriteriaQueries {

	public static void main(String[] args) 
	{
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session s1 = sessionFactory.openSession();
		
		Query query1 = s1.createQuery("select sum(price) FROM Product");
		
		
		
		Iterator itr = query1.list().iterator();
		while(itr.hasNext())
		{	
			System.out.println(itr.next());
		}
		
		
		s1.close();
		
		//----------------------------------------------
		Session s2 = sessionFactory.openSession();
		Query query2 = s2.createQuery("from Product order by price desc");
		Iterator itr1 = query2.list().iterator();
		while(itr1.hasNext())
		{
			Product p = (Product)itr1.next();
			System.out.println(p.getName()+" | "+p.getPrice());
		}
		s2.close();
		
		//----------------------------------------------order by price criteria
				Session s3 = sessionFactory.openSession();
				Query query3 = s3.createQuery("from Product");
				Criteria cr = s3.createCriteria(Product.class);
				cr.addOrder(Order.asc("price"));
				
				Iterator itr3 = cr.list().iterator();
				while(itr3.hasNext())
				{
					Product p = (Product)itr3.next();
					System.out.println(p.getName()+" | "+p.getPrice());
				}
				s3.close();
				
		//----------------------------------------------
		Session s5 = sessionFactory.openSession();
		Query query5 = s5.createQuery("select name,count(name)  from Product group by name");
		
		Iterator itr5 = query5.list().iterator();
		while(itr5.hasNext())
		{
			Object p[] = (Object[])itr5.next();
			System.out.println(p[0]+" | "+p[1]);
			
		}
		s5.close();
		
		//--------------------------------------------------------------------------
		System.out.println("------------------------------");
		Session s4 = sessionFactory.openSession();
		//Query query4 = s4.createQuery("from Product");
		Criteria cr4 = s4.createCriteria(Product.class);
		
		cr4.setProjection(Projections.projectionList()
				.add(Projections.groupProperty("name"))
				.add(Projections.count("name")));
		//.setResultTransformer(Transformers.aliasToBean(Product.class));
		
		Iterator itr4 = cr4.list().iterator();
		while(itr4.hasNext())
		{
			Object p[] = (Object[])itr4.next();
			//System.out.println(p);
			System.out.println(p[0]+" | "+p[1]);
			
		}
		s4.close();
		
		System.out.println("------------------------------");
		
		//----------------------------------------------
				Session s6 = sessionFactory.openSession();
				Query query6 = s6.createQuery("select avg(price)  from Product");
				
				Iterator itr6 = query6.list().iterator();
				while(itr6.hasNext())
				{
					System.out.println(itr6.next());
					
				}
				s6.close();
				
		//----------------------------------------------
				System.out.println("7------------------------------7");
				Session s7 = sessionFactory.openSession();
				//Query query7 = s7.createQuery("from Product");
				Criteria cr7 = s7.createCriteria(Product.class);
				cr7.setProjection(Projections.projectionList()
						.add(Projections.avg("price")));
				
				Iterator itr7 = cr7.list().iterator();
				while(itr7.hasNext())
				{
					System.out.println(itr7.next());
					
				}
				s7.close();
	}

}
