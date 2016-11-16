package com.spring.aop.SpringAOPUserActivities;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserHandler 
{
	List <User> userList = new CopyOnWriteArrayList<User>();
	List <User> loginList = new CopyOnWriteArrayList<User>();
	public void login(String loginName,String password)
	{
			System.out.println("login method.....");
			if(loginName.equals(password))
			{
				int flag=0;
				for(User uu : userList)
				{
					if(uu.getLoginName().equals(loginName) && uu.getPassword().equals(password))
					{
						flag=1;
						loginList.add(uu);
						System.out.println("Login Successfully...");
					}
				}
				if(flag==0)
					System.out.println("failed!!! First Register plz...");
				
			}
		
	}
	public void logout(String loginName,String password) 
	{
		if(loginName==null)
		{
			throw new NullPointerException();
		}
		else
		{
			for(User ll : loginList)
			{
				if(ll.getLoginName().equals(loginName) && ll.getPassword().equals(password))
				{
					loginList.remove(ll);
					System.out.println("Successfully logout....");
				}
			}
		}
		//System.out.println("Successfully logout....");
	}
	public void register(String loginName,String password,String firstName,String country)
	{
		User u = new User(loginName, password, firstName, country);
		userList.add(u);
		//return u;
	}
}
