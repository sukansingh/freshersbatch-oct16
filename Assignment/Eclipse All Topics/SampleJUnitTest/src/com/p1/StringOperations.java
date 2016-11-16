package com.p1;

public class StringOperations 
{
	public String concat(String s1,String s2)
	{
		return s1+s2;
	}
	public char getCharacter(String s,int index)
	{
		if(s==null || s.length()==0)
		{
			return 0;
		}
		else
			return s.charAt(index);
	}
	public int getLength(String s)
	{
		if(s==null)
			return 0;
		else
			return s.length();
	}
}
