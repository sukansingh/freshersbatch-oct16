package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>
{
	private String name;
	private int weight;
	private int height;
	public Person(String name,int weight,int height)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public String getName()
	{
		return this.name;
	}
	public int getWeight()
	{
		return this.weight;
	}
	public int getHeight()
	{
		return this.height;
	}
	
	@Override
	public int compareTo(Person p1)
	{
		if(p1.getWeight() > this.weight)
		{
			return 1;
		}
		else if(p1.getWeight() < this.weight)
		{
			return -1;
		}
		else
		{
			if(p1.getHeight() > this.height)
				return 1;
			else if(p1.getHeight() < this.height)
				return -1;
			else
				return 0;
		}
	}
	
	
}

public class PersonTreeSet 
{

	public static void main(String[] args) 
	{
		Person p[] = new Person[5];
		p[0] = new Person("Tom",50,5);
		p[1] = new Person("Jerry",60,6);
		p[2] = new Person("John",40,4);
		p[3] = new Person("Ivan",70,7);
		p[4] = new Person("Lucy",40,5);
		
		Set<Person> ts = new TreeSet<Person>();
		for(int i=0;i<p.length;i++)
			ts.add(p[i]);
		
		Iterator <Person> itr = ts.iterator();
		while(itr.hasNext())
		{
			Person pp = itr.next();
			System.out.println(pp.getName()+" - "+pp.getWeight()+" - "+pp.getHeight());
		}
	}

}
