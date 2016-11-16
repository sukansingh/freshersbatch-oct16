package com.spring_hibernate_rest.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring_hibernate_rest.entity.User;

public class UserDAOImp implements UserDAO
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public User createUser(User user) 
	{
		hibernateTemplate.save(user);
		return user;
	}
	
	@Transactional
	public String loginUser(String username, String password)
	{
		//Query query = hibernateTemplate.
		List <User> userList = new ArrayList<User>();
		userList = (List<User>) hibernateTemplate.find("from User");
		
		for(User u : userList)
		{
			System.out.println("user u : "+u.getName());
		}
		return "list";
		//return userDao.loginUser(username,password);
	}
	
}
