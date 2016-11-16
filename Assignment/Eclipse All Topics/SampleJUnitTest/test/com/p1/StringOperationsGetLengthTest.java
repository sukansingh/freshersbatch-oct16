package com.p1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringOperationsGetLengthTest 
{
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("\t\tbeforeClass Called");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("\t\tAfterClass Called");
	}
	@Before
	public void before()
	{
		System.out.println("\tbefore Called");
	}
	
	@After
	public void after()
	{
		System.out.println("\tAfter Called");
	}
	
	@Test
	public void basicTest() 
	{
		StringOperations so = new StringOperations();
		String s1="Hello";
		assertEquals(5, so.getLength(s1));
		
	}
	@Test
	public void NullTest() 
	{
		StringOperations so = new StringOperations();
		String s1=null;
		assertEquals(0, so.getLength(s1));
		
	}

}
