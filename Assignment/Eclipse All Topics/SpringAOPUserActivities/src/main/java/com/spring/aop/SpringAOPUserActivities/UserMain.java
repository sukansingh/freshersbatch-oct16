package com.spring.aop.SpringAOPUserActivities;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans_aop.xml");
		//UserHandler uh = (UserHandler) context.getBean("userHandler");
		
		String loginName=null;
		String password=null;
		
		while(true)
		{
			System.out.println("1. Login");
			System.out.println("2. Logout");
			System.out.println("3. Register");
			System.out.println("Enter ur Choice");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				
				System.out.println("Enter ur Login Name");
				 loginName = sc.next();
				System.out.println("Enter ur Password");
				 password = sc.next();
				 UserHandler uh = (UserHandler) context.getBean("userHandler");
				 uh.login(loginName, password);
				break;
			case 2:
				UserHandler uh2 = (UserHandler) context.getBean("userHandler");
				uh2.logout(loginName, password);
				break;
			case 3:
				
				System.out.println("Enter ur Login Name");
				String username = sc.next();
				System.out.println("Enter ur Password");
				String pass = sc.next();
				System.out.println("Enter ur First Name");
				String firstName = sc.next();
				System.out.println("Enter ur country");
				
				String country = sc.next();
				UserHandler uh3 = (UserHandler) context.getBean("userHandler");
				uh3.register(username, pass, firstName, country);
				break;
			}//end of switch main
		}//end of while
	}

}
