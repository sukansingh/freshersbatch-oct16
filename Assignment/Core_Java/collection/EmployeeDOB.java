package collection;

import collection.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


class Date 
{
	private int day,month,year;
	public Date()
	{
		this.day = 17;
		this.month = 10;
		this.year = 2016;
	}
	public Date(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay()
	{
		return this.day;
	}
	public int getMonth()
	{
		return this.month;
	}
	public int getYear()
	{
		return this.year;
	}
	
	public String toString()
	{
		return (day+"-"+month+"-"+year);
	}
	
	@Override
	public int hashCode() {
		int hash = day + month;
		return hash;
	}
	
	@Override
	public boolean equals(Object object)
	{
		if((((Date) object).getDay())==this.day && (((Date) object).getMonth())==this.month)
			return true;
		else
			return false;	
	}
	
}

public class EmployeeDOB 
{
	
	public static void main(String[] args) 
	{
		Map <Date,String> hmap = new HashMap<Date,String>();
		
		hmap.put(new Date(10,12,1993),"Tom");
		hmap.put(new Date(1,8,1995),"Jerry");
		hmap.put(new Date(10,12,2000),"John");
		
		Iterator<Date> itr = hmap.keySet().iterator();
		while(itr.hasNext())
		{
			
			System.out.println(hmap.get(itr.next()));
		}
		System.out.println(hmap.get(new Date(10,12,2000)));
	}

}
