package com.vehicle.TablePerClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class VehicleMain 
{

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Vehicle v = new Vehicle(12345);
		Car c = new Car(1000000,"four wheelar");
		Bike b = new Bike(60000,"two wheelar");
		
		Transaction t = session.beginTransaction();
		
		session.save(c);
		session.save(b);
		
		t.commit();
		
	}

}
