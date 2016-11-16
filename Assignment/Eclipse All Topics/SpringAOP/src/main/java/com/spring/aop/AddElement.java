package com.spring.aop;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AddElement 
{
	public Vector<Integer> addInVector()
	{
		System.out.println("vector() called");
		Vector<Integer> v = new Vector<Integer>();
		for(int i=1;i<=1000;i++)
		{
			v.add(i);
		}
		return v;
	}
	public List<Integer> addInList()
	{
		System.out.println("List() called");
		List<Integer> l = new ArrayList<Integer>();
		for(int i=1;i<=1000;i++)
		{
			l.add(i);
		}
		return l;
	}
}
