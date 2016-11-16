package nested;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;
class Cache
{
	private static class Maintain
	{
		static HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		private Date timestamp;
		private String data;
		private int key;
		
		
		public void setData(int key,String d)
		{
			this.data = d;
			
			this.key = key;
			
			this.timestamp = new Date();
			String val = (this.data+","+this.timestamp);
			hm.put(this.key, val);
			for(Map.Entry m:hm.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
		
		public String getData(int key)
		{
			return (hm.get(key));
		}
	}
	
	
	public void add(int kk,String data)
	{
		Scanner sc = new Scanner(System.in);
		Maintain obj = new Maintain();
		obj.setData(kk,data);
		
	}
	public String get(int k)
	{
		
		Maintain obj = new Maintain();
		String s = obj.getData(k);
		return s;
	}
}

public class CacheMain {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Cache c = new Cache();
		
		System.out.println("Enter your Data : ");
		String data = sc.nextLine();
		String rand="";
		for(int i=1;i<=6;i++)
		{
			rand += (int)(Math.random()*8)+1;
		}
		int key = Integer.parseInt(rand);
		c.add(key,data);
		System.out.println("your Access id (key) is : "+key);
		
		//System.out.println("Enter your id/key : ");
		//int kk = sc.nextInt();
		
		String yourData = c.get(key);
		System.out.println("Your data is : "+yourData);
	}

}
