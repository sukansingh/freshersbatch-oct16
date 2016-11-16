package com.spring_hibernate_rest.service;

import com.spring_hibernate_rest.entity.User;

public interface UserService 
{
	public String loginUser(String username, String password);
	public User createUser(User user);
}
