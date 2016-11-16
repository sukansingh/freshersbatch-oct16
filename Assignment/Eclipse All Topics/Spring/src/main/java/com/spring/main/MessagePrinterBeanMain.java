package com.spring.main;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.MessagePrinterBean;

public class MessagePrinterBeanMain
{

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans_simple.xml");
		
		MessagePrinterBean mp = (MessagePrinterBean)context.getBean("messagePrinter");
		
		//System.out.println("get Message : "+mp.getMessage());
		
	}

}
