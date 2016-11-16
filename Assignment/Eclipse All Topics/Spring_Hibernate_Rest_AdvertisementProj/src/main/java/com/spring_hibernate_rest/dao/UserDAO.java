package com.spring_hibernate_rest.dao;

import com.spring_hibernate_rest.entity.User;

public interface UserDAO 
{
	public User createUser(User user);
	public String loginUser(String username, String password);
}
