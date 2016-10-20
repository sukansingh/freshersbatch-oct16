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
	public Date get()
	{
		return dob;
	}
	public Object clone() throws CloneNotSupportedException
	{
		Employee tmp = new Employee(new Date());
		return tmp;
	}
}
class DeepCopy
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
		}
		catch(CloneNotSupportedException c){}
	}
}