package com.spring.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AddElementAspect 
{
	@Pointcut("execution(* AddElement.*())")
	public void  time_pointcut(){}
	
	long start=0;
	long end=0;
	
	@Before("time_pointcut()")
	public void beforeCall(JoinPoint jp)
	{
		System.out.println("before called");
		start = System.currentTimeMillis();
	}
	
	@After("time_pointcut()")
	public void afterCall(JoinPoint jp)
	{
		System.out.println("after called");
		end = System.currentTimeMillis();
		System.out.println("Time : "+(end-start));
	}
	/*
	@Around
	public Object<?> measureTime()
	{
		
	}
	*/
}
