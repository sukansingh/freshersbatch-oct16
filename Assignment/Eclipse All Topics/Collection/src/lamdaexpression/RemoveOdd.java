package lamdaexpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class RemoveOdd {

	public static void main(String[] args) 
	{
		List <String> ar = new ArrayList<String>();
		ar.add("ABC");
		ar.add("Jerry");
		ar.add("PQ");
		ar.add("abcd");
		ar.add("Hello");
		
		
		ar.removeIf((String s) -> s.length()%2==0);
			
			System.out.println(ar );
		}
		
	}
	
