package com.reflection;

import java.lang.reflect.*;
public class DisplayInfo {

	public static void main(String[] args) throws Exception
	{
		Class c = Class.forName(args[0]);
		
		Constructor con[] = c.getDeclaredConstructors();
		Field f[] = c.getDeclaredFields();
		Method m[] = c.getDeclaredMethods();
		
		for(int i=0;i<con.length;i++)
		{
			System.out.println(con[i]);
		}
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}
	}
	public String toUpperCase(String str)
	{
		str = str.toUpperCase();
		return str;
	}

}
