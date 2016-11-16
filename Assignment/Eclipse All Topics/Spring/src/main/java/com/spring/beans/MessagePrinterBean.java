package com.spring.beans;

import java.lang.annotation.Inherited;

import org.springframework.beans.factory.BeanNameAware;

public class MessagePrinterBean implements BeanNameAware
{
	
	private String message = null;
	
	public MessagePrinterBean() {
		System.out.println("MessagePrinterBean created!!");
	}
	
	public String getMessage() 
	{
		//System.out.println("getMessage()...");
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("setMessage(): " + message);
	}

    public void printMessage() {
        System.out.println(message);
    }
	
    public void setBeanName(String beanName) 
	{
    	System.out.println("Bean name is: " + beanName);
	}
    
    public void initBean()
    {
    	System.out.println("Inside initBean()");
    }
}
