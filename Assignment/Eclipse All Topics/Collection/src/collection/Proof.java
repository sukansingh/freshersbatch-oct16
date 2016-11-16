package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Proof {

	public static void main(String[] args) 
	{
		
		//HashSet
		System.out.println("HashSet UnOrdered");
		Set <Integer> hset = new HashSet<Integer>();
		hset.add(10);
		hset.add(50);
		hset.add(5);
		hset.add(70);
		
		Iterator <Integer> itr = hset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----------------------");
		System.out.println("Linked List Ordered");
		//LinkedList
		List <Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(50);
		ll.add(5);
		ll.add(70);
		
		itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
