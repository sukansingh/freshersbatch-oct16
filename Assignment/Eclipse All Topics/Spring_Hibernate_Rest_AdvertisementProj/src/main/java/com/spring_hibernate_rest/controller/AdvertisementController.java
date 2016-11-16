package com.spring_hibernate_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring_hibernate_rest.entity.Advertise;
import com.spring_hibernate_rest.entity.User;
import com.spring_hibernate_rest.service.AdvertiseService;
import com.spring_hibernate_rest.service.UserService;

@RestController
public class AdvertisementController 
{
	@Autowired
	private UserService userService;
	
	@Autowired
	private AdvertiseService advertiseService;
	
	@RequestMapping(value="/login/{uname}/{pass}", method=RequestMethod.GET)
	public String loginUser(@PathVariable(value="uname")String username,@PathVariable(value="pass")String password)
	{
		return userService.loginUser(username,password);
		// username+" | "+password;
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public User createUser(@RequestBody User user)
	{
		return userService.createUser(user);
		
	}
	
	@RequestMapping(value="/adveritse", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Advertise createAdvertise(@RequestBody Advertise advertise)
	{
		return advertiseService.createAdvertise(advertise);
		
	}
	
	

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public AdvertiseService getAdvertiseService() {
		return advertiseService;
	}

	public void setAdvertiseService(AdvertiseService advertiseService) {
		this.advertiseService = advertiseService;
	}
	
	
}
