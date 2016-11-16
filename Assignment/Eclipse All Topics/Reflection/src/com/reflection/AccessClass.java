package com.reflection;
import com.reflection.*;
public class AccessClass 
{
	public static void main(String args[]) throws Exception
	{
		Class paramType[] = new Class[1];
		paramType[0] = String.class;
		
		Object paramValue[] = new Object[1];
		paramValue[0]  ="tom";
		
		String capName = (String)Midddleware.invokeMethod("com.reflection.DisplayInfo","toUpperCase",paramType,paramValue);
		System.out.println(capName);
	}
}