package com.spring.aop.SpringAOPUserActivities;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class UserAspect 
{
	@Pointcut("execution(* UserHandler.*(..))")
	public void length_pointcut(){}
	
	@Before("length_pointcut()")
	public void checkLength(JoinPoint jp)
	{
		System.out.println("Before method");
		//String args[] = (String[])jp.getArgs();
		Object args[] = jp.getArgs();
		for(int i=0;i<args.length;i++)
		{
			 if(args[i]==null || args[i].toString().length() < 3)
			 {
				 System.out.println("Minimum length must be 3");
			 }
		}
	}
	
	@Pointcut("execution(* UserHandler.logout(..))")
	public void logout_pointcut(){}
	
	@AfterThrowing("logout_pointcut()")
	public void checkLogout(JoinPoint jp, Throwable excep)
	{
		Object args[] = jp.getArgs();
		for(int i=0;i<args.length;i++)
		{
			// if(args[i]==null || ((UserHandler)args[i]).login < 3)
			// {
			//	 System.out.println("Minimum length must be 3");
			// }
		}
	}
}
