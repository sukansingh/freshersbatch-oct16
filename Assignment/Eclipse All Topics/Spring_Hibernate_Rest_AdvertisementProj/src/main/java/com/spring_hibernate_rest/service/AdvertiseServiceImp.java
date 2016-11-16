package com.spring_hibernate_rest.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring_hibernate_rest.dao.AdvertiseDAO;
import com.spring_hibernate_rest.entity.Advertise;

public class AdvertiseServiceImp implements AdvertiseService
{
	@Autowired
	private AdvertiseDAO advertiseDao;
	
	public Advertise createAdvertise(Advertise advertise) 
	{
		return advertiseDao.createAdvertise(advertise);
	}
	
}
