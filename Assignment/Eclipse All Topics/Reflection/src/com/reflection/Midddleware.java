package com.reflection;

import java.lang.reflect.*;
public class Midddleware 
{
	public static Object invokeMethod(String className,String methodName,Class[] paramType,Object[] paramValue) throws Exception
	{
		System.out.println(className);
		Class c = Class.forName(className);
		Object obj = c.newInstance();

		Method m = c.getDeclaredMethod(methodName, paramType);
		System.out.println(m);
		Object ss = m.invoke(obj, paramValue);
		
		return ss;
	}
}


