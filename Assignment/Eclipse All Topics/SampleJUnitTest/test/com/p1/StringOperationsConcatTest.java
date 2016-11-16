package com.p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringOperationsConcatTest 
{

	@Test
	public void basicTest() 
	{
		StringOperations so = new StringOperations();
		String s1="Hello";
		String s2="World";
		assertEquals(s1+s2, so.concat(s1, s2));
		//fail("Not yet implemented");
	}
	@Test
	public void NullTest() 
	{
		StringOperations so = new StringOperations();
		String s1=null;
		String s2=null;
		assertEquals(s1+s2, so.concat(s1, s2));
		//fail("Not yet implemented");
	}

}
