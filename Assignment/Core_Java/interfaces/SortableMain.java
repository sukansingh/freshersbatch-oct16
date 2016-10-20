interface Sortable
{
	boolean compare(Sortable s1, Sortable s2);
	int get();
	String toString();
}
class Employee implements Sortable
{
	private int id;
	public Employee(int id)
	{
		this.id = id;
	}
	public int get()
	{
		return this.id;
	}
	public boolean compare(Sortable s1, Sortable s2)
	{
		if(s1.get() < s2.get())
			return true;
		else
			return false;
	}
	public String toString()
	{
		return (this.id+" ");
	}
}

class Circle implements Sortable
{
	private int radius;
	public Circle(int radius)
	{
		this.radius = radius;
	}
	public int get()
	{
		return this.radius;
	}
	public boolean compare(Sortable s1, Sortable s2)
	{
		if(s1.get() < s2.get())
			return true;
		else
			return false;
	}
	public String toString()
	{
		return (this.radius+" ");
	}
}

public class SortableMain
{
	public static void main(String arg[])
	{
		Sortable s[] = new Sortable[6];
		s[0] = new Employee(1);
		s[1] = new Employee(5);
		s[2] = new Employee(3);
		s[3] = new Employee(2);
		s[4] = new Employee(6);
		s[5] = new Employee(4);
		//s[1] = new Circle(1);
		sortAll(s);
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}
	public static void sortAll(Sortable ss[])
	{
		//Sortable tmps = new Sortable();
		for(int i=0;i<ss.length;i++)
		{
			for(int j=0;j<ss.length;j++)
			{
				if(ss[i].compare(ss[i],ss[j]))
				{
					Sortable tmp = ss[i];
					ss[i] = ss[j];
					ss[j] = tmp;
				}
			}
		}
	}
}