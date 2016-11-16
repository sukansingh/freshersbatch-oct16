package com.p1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;

public class StringOperationsParameterizedTest 
{

	@Before
	public void before()
	{
		System.out.println("\tbefore Called");
	}
	
	@Parameter(value=0)
	String s1;
	
	@Parameter(value=1)
	String s2;
	
	public static Collection<Object[]> data()
	{
		String arr[][] = {{"Hello","World"},{null,"World"},{null,null}};
		ArrayList arrayList = new ArrayList(Arrays.asList(arr)); 
		return arrayList;
	}
	@Test
	public void basicTest() 
	{
		StringOperations so = new StringOperations();
		data();
		
		assertEquals(s1+s2, so.concat(s1, s2));
		//fail("Not yet implemented");
	}
}
