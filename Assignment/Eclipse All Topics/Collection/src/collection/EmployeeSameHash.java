package collection;

import collection.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class EmployeeSameHash 
{
	private int id;
	public EmployeeSameHash(int id)
	{
		this.id = id;
	}
	@Override
	public int hashCode() {
		return 3;
	}
	
	@Override
	public boolean equals(Object object)
	{
		return true;
	}
	public static void main(String[] args) 
	{
		Map <EmployeeSameHash,String> hmap = new HashMap<EmployeeSameHash,String>();
		
		hmap.put(new EmployeeSameHash(1),"Tom");
		hmap.put(new EmployeeSameHash(2),"Jerry");
		hmap.put(new EmployeeSameHash(3),"John");
		
		Iterator<EmployeeSameHash> itr = hmap.keySet().iterator();
		while(itr.hasNext())
		{
			
			System.out.println(hmap.get(itr.next()));
		}
		System.out.println("----------------");
		System.out.println(hmap.get(new EmployeeSameHash(1)));
		System.out.println(hmap.get(new EmployeeSameHash(2)));
		System.out.println(hmap.get(new EmployeeSameHash(3)));
	}

}
