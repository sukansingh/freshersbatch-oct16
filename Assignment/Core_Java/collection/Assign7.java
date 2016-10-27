package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class Parked_CarOwner_Details
{
	private String ownerName;
	private String carModel;
	private int carNo;
	private int ownerMobileNo;
	private String ownerAdd;
	
	public Assign7(String ownerName, String carModel, int carNo, int ownerMobileNo, String ownerAdd)
	{
		this.ownerName=ownerName;
		this.carModel=carModel;
		this.carNo=carNo;
		this.ownerMobileNo=ownerMobileNo;
		this.ownerAdd=ownerAdd;
	}
	
	public String getOwnerName()
	{
		return ownerName;
	}
	public void setOwnerName()
	{
		this.ownerName=ownerName;
	}
	
	public String getCarModel()
	{
		return carModel;
	}
	public void setCarModel()
	{
		this.carModel=carModel;
	}
	
	public int getCarNo()
	{
		return carNo;
	}
	public void setCarNo()
	{
		this.carNo=carNo;
	}
	
	public int getOwnerMobileNo()
	{
		return ownerMobileNo;
	}
	public void setOwnerMobileNo()
	{
		this.ownerMobileNo=ownerMobileNo;
	}
	
	public String getOwnerAdd()
	{
		return ownerAdd;
	}
	public void setOwnerAdd()
	{
		this.ownerAdd=ownerAdd;
	}
	
	public String toString()
	{
		return this.ownerName+"-"+this.carModel+"-"+this.carNo+"-"+this.ownerMobileNo+"-"+this.ownerAdd;
	}
	
}

class Parked_CarOwenerList 
{
	private static final AtomicInteger count = new AtomicInteger(0);
	private int token;
	private int floor;
	private int section;
	Map<Integer,Assign7> hmap=new HashMap<Integer,Assign7>();
	Map<Integer, Parked_CarOwenerList> lmap=new HashMap<Integer,Parked_CarOwenerList>();
	
	Parked_CarOwenerList(int floor, int sec)
	{
		this.floor=floor;
		this.section=sec;
		this.token=count.incrementAndGet();
	}
	
	public int add_new_car(Assign7 s)
	{
		hmap.put(this.token, s);
		lmap.put(this.token, this);
		return this.token;
		
	}
	
	public void remove_car()
	{
		hmap.remove(this.token);
		lmap.remove(this.token);
	}
	
	public void get_parked_car_location(int token)
	{
		System.out.println(hmap.get(this.token));
		System.out.println(lmap.get(this.token));
	}
	
	public String toString()
	{
		return this.floor+"-"+this.section;
	}
	
}

public class Assign7 {

	public static void main(String[] args) {
		
		Assign7 p1=new Assign7("ABC","DEF",1423,7984621,"PUNE");
		Parked_CarOwenerList l1=new Parked_CarOwenerList(2,3);
		int t=l1.add_new_car(p1);
		l1.get_parked_car_location(t);
		l1.remove_car();
		l1.get_parked_car_location(t);
		
	}

}
