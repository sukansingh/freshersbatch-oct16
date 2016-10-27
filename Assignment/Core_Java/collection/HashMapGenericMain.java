package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class HashMapGeneric
{
	public HashMapGeneric()
	{
		
	}
	public static void printMapKeyValues(Map<? extends Number,String> map) 
	{
		Iterator <? extends Number> itr = map.keySet().iterator();
		while(itr.hasNext())
		{
			Object o = itr.next();
			System.out.println("Key : "+o+" | Value : "+map.get(o));
		}
	}
}
public class HashMapGenericMain {

	public static void main(String[] args) 
	{
		Map <Integer,String> m = new HashMap<Integer,String>();
		m.put(1, "ABC");
		m.put(2, "PQR");
		m.put(3, "TOM");
		
		HashMapGeneric obj = new HashMapGeneric();
		HashMapGeneric.printMapKeyValues(m);
	}

}
