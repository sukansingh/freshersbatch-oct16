package lamdaexpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;
class Order
{
	private int id;
	private int price;
	private String status;
	public Order(int id,int price,String status)
	{
		this.id = id;
		this.price = price;
		this.status = status;
	}
	public int getPrice()
	{
		return price;
	}
	public String getStatus()
	{
		return status;
	}
	public String toString()
	{
		return id+" "+price+" "+status;
	}
}
public class OrderFilter
{

	public static void main(String[] args) 
	{
		List <Order> ar = new ArrayList<Order>();
		ar.add(new Order(1,11000,"Accepted"));
		ar.add(new Order(2,20000,"Completed"));
		ar.add(new Order(3,5000,"Completed"));
		ar.add(new Order(4,50000,"Accepted"));
		
		List <Order> filterByPrice = new ArrayList<Order>();
		List <Order> filterByStatus = new ArrayList<Order>();
		
		Iterator<Order> itr = ar.iterator();
		while(itr.hasNext())
		{
			Order ob = itr.next();
			Predicate<Order> p1 = (Order o)-> ob.getPrice() > 10000;
			Predicate<Order> p2 = (Order o)-> ob.getStatus().equals("Accepted");
			if(p1.test(ob))
			{
				filterByPrice.add(ob);
			}
			if(p2.test(ob))
			{
				filterByStatus.add(ob);
			}
			
			
		}
		//itr = filterByPrice.iterator();
		//while(itr.hasNext())
		//{
		System.out.println(filterByPrice);
		System.out.println(filterByStatus);
	}

}
