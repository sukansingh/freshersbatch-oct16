package com.spring.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddElementMain {

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans_aop.xml");
		AddElement a = (AddElement) context.getBean("addElement");
		
		System.out.println("Vector -");
		a.addInVector();
		
		System.out.println("List -");
		a.addInList();
	}

}
