package com.spring_hibernate_rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring_hibernate_rest.entity.Advertise;

public class AdvertiseDAOImp implements AdvertiseDAO
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public Advertise createAdvertise(Advertise advertise) 
	{
		hibernateTemplate.save(advertise);
		return advertise;
	}

}
