package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
public class BackwordArrayList {

	public static void main(String[] args) 
	{
		List <Integer> aryList = new ArrayList<Integer>();
		
		aryList.add(10);
		aryList.add(50);
		aryList.add(5);
		aryList.add(70);
		/*
		System.out.println(aryList);
		Collections.reverse(aryList);
		System.out.println(aryList);
		*/
		ListIterator<Integer> litr = aryList.listIterator(aryList.size());
		
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
	}

}
