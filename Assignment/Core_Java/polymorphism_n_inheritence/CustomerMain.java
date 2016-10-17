class Customer
{
	private int id;
	private String name;
	private int bal;
	
	public Customer(int id,String name,int bal)
	{
		this.id = id;
		this.name = name;
		this.bal = bal;
	}
	
	public int getBal()
	{
		return bal;
	}
	
	public String toString()
	{
		return (id+" - "+name);
	}
}

class Saving extends Customer
{
	private int fixDeposit;
	
	public Saving(int id,String name,int fixDeposit)
	{
		super(id,name,fixDeposit);
		this.fixDeposit = fixDeposit;
	}
	public int getBal()
	{
		return fixDeposit;
	}
}

class Current extends Customer
{
	private int cash;
	
	public Current(int id,String name,int cash)
	{
		super(id,name,cash);
		this.cash = cash;
	}
	public int getBal()
	{
		return cash;
	}
}

public class CustomerMain
{
	public static void main(String arg[])
	{
		Customer c[] = new Customer[2];
		c[0] = new Saving(1,"Ram",1000);
		c[1] = new Current(1,"Ram",2000);
		
		System.out.println("Saving Account Amt : "+c[0]+" => "+c[0].getBal());
		System.out.println("Current Account Amt : "+c[1]+" => "+c[1].getBal());
		
		System.out.println("Total Amt : "+getTotalBal(c));
	}
	public static int getTotalBal(Customer t[])
	{
		int total=0;
		for(int i=0;i<t.length;i++)
		{
			total += t[i].getBal();
		}
		return total;
	}
}