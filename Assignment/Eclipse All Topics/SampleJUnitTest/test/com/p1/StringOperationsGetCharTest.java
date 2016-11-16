package com.p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringOperationsGetCharTest 
{

	@Test
	public void basicTest() 
	{
		StringOperations so = new StringOperations();
		String s1="Hello";
		int index=0;
		assertEquals(s1.charAt(index), so.getCharacter(s1, index));
		
	}
	@Test
	public void NullTest() 
	{
		StringOperations so = new StringOperations();
		String s1=null;
		int index=0;
		assertEquals(0, so.getCharacter(s1, index));
		
	}

}
