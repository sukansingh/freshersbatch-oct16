package com.spring.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.*;
public class OrderMain {

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans_simple.xml");
		//Item item = new Item("Teddy", 2000);
		List <Order> orderList = new ArrayList<Order>();
		
		Order order1 = (Order)context.getBean("order1");
		Order order2 = (Order)context.getBean("order2");
		
		orderList.add(order1);
		orderList.add(order2);
		for(Order order:orderList)
		{
			System.out.println("Order : "+order.getName()+" Items : "+order.getItem());
		}
		
		int sum=0;
		for(Order order:orderList)
		{
			sum += order.getItem().getPrice();
		}
		System.out.println("Sum of All Order Price is : "+sum);
		
		
	}

}
