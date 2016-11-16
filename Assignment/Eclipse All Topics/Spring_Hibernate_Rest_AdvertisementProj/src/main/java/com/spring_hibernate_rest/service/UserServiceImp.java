package com.spring_hibernate_rest.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring_hibernate_rest.dao.UserDAO;
import com.spring_hibernate_rest.entity.User;

public class UserServiceImp implements UserService
{
	@Autowired
	private UserDAO userDao;
	
	public User createUser(User user) 
	{
		return userDao.createUser(user);
	}
	
	public String loginUser(String username, String password)
	{
		return userDao.loginUser(username,password);
	}

}
