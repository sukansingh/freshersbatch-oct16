import java.util.*;
class Person implements Comparable<Person> 
{
	private String name;
	private double height;
	private double weight;
	
	public Person(String name,double height,double weight)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	/*
	public void setName(String name)
	{
		this.name = name;
	}
	public void setName(double height)
	{
		this.height = height;
	}
	public void setName(double weight)
	{
		this.weight = weight;
	}
	*/
	public int compareTo(Person p1)
	{
		if(p1.getName().compareTo(this.name) > 0)
		{
			return 1;
		}
		else if(p1.getName().compareTo(this.name) < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	public String getName()
	{
		return this.name;
	}
	public double getHeight()
	{
		return this.height;
	}
	public double getWeight()
	{
		return this.weight;
	}
	
	public String toString()
	{
		return (this.name+" - "+this.height+" - "+this.weight);
	}
}

class PersonComparator implements Comparator<Person>
{
	public int compare(Person p1,Person p2)
	{
		if(p1.getName().compareTo(p2.getName()) > 0)
		{
			return 1;
		}
		else if(p1.getName().compareTo(p2.getName()) < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}

public class PersonMain
{
	public static  void main(String arg[])
	{
		Person p1 = new Person("Tom",5,60);
		Person p2 = new Person("Jerry",4.5,70);
		Person p3 = new Person("John",6,50);
		
		List <Person> pList = new ArrayList<Person>();
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		Collections.sort(pList,new PersonComparator());
		
		for(Person pt : pList)
		{
			System.out.println(pt);
		}
	}
}
