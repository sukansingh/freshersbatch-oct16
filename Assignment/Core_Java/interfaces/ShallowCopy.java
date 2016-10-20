import java.util.*;
class Employee implements Cloneable
{
	//private int id;
	//private String name;
	private Date dob;
	public Employee(Date dob)
	{
		this.dob = dob;
	}
	public void set(Date dd)
	{
		this.dob = dd;
	}
	public Date get()
	{
		return dob;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class ShallowCopy
{
	public static void main(String arg[])
	{
		Date d = new Date();
		//System.out.println(d);
		Employee e1 = new Employee(d);
		System.out.println("e1 : "+e1.get());
		try
		{
			Employee e2 = (Employee)e1.clone();
			System.out.println("e2 : "+e2.get());
			
			System.out.println("e1 hashcode : "+e1.hashCode());
			System.out.println("e2 hashcode : "+e2.hashCode());
			
			System.out.println("e1 Dob hashcode : "+e1.get().hashCode());
			System.out.println("e2 Dob hashcode : "+e2.get().hashCode());
			//-------------------
			e2.set(new Date());
			System.out.println("e2 after set : "+e2.get());
			System.out.println("e1 hashcode : "+e1.hashCode());
			System.out.println("e2 hashcode : "+e2.hashCode());
				
			System.out.println("e1 Dob hashcode : "+e1.get().hashCode());
			System.out.println("e2 Dob hashcode : "+e2.get().hashCode());
		}
		catch(CloneNotSupportedException c){}
		
		
	}
}