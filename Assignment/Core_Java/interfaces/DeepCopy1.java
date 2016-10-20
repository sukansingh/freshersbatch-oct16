import java.util.*;
class Employee implements Cloneable
{
	//private int id;
	//private String name;
	private String name;
	public Employee(String name)
	{
		this.name = name;
	}
	public void set(String n)
	{
		this.name = n;
	}
	public String get()
	{
		return name;
	}
	public Object clone() throws CloneNotSupportedException
	{
		Employee tmp = new Employee("Shyam");
		return tmp;
	}
}
class DeepCopy1
{
	public static void main(String arg[])
	{
		Employee e1 = new Employee("Ram");
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
			/*
			e2.set("Shyam");
			System.out.println("e1 after e2 set : "+e1.get());
			System.out.println("e2 after set : "+e2.get());
			System.out.println("e1 hashcode : "+e1.hashCode());
			System.out.println("e2 hashcode : "+e2.hashCode());
				
			System.out.println("e1 Dob hashcode : "+e1.get().hashCode());
			System.out.println("e2 Dob hashcode : "+e2.get().hashCode());
			*/
		}
		catch(CloneNotSupportedException c){}
		
		
	}
}