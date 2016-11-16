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

public class CRUD_Operations2 
{
	public static void main(String args[])
	{
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		//Create
		
		Session s1 = sessionFactory.openSession();
		Transaction t = s1.beginTransaction();
		
		//String sqlQ = "insert into product_master(p_id,name,cost) values(?,?,?)";
		String sqlQ = "insert into product_master(p_id,name,cost) values(46,'DD',50000)";
		//String sqlQ = "select * from product_master";
		
		/*
		Product p = new Product("Teddy",500);
		s1.save(p);
		System.out.println(p.getId());
		*/
		SQLQuery sqlQuery = s1.createSQLQuery(sqlQ);
		/*
		sqlQuery.setParameter(0, p.getId());
		sqlQuery.setParameter(1, p.getName());
		sqlQuery.setParameter(2, p.getPrice());
		*/
		int i = sqlQuery.executeUpdate();
		System.out.println("record insertd : "+i);
		t.commit();
		s1.close();
		
		
		/*
		sqlQuery.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		List<Map> productList = sqlQuery.list();
		for(Map hmapRow: productList) {
			//Map hmapRow = (Map)data;
			System.out.println(hmapRow.get("P_ID") + " - " + hmapRow.get("NAME"));
		}
		*/
		
		
		//READ
		Session s3 = sessionFactory.openSession();
		Query query = s3.createQuery("from Product");
		List prod = query.list();
		System.out.println(prod);
		s3.close();
		
	}
	
	
}
