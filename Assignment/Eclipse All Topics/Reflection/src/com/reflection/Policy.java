package com.reflection;

import java.lang.reflect.*;

class Sample
{
	private String name;
	private int age;
	public Sample()
	{
		name = "tom";
		age = 20;
	}
	private void f1()
	{
		System.out.println(this.name+" | "+this.age);
	}
	private void f2()
	{
		System.out.println("f2 private method");
	}
}

public class Policy {

	public static void main(String[] args) throws Exception 
	{
		Class c = Class.forName(args[0]);
		Method m[] = c.getDeclaredMethods();
		Constructor con = c.getDeclaredConstructor(null);
		System.out.println("con mdf : "+con.getModifiers());
		for(Method mm : m)
		{
			int mdf =  mm.getModifiers();
			//System.out.println("mdf : "+mdf);
			if(mdf==2)
			{
				Object obj = c.newInstance();
				mm.setAccessible(true);
				mm.invoke(obj, null);
			}
		}
		
	}

}
