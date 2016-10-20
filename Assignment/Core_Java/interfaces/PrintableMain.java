interface Printable
{
	void print();
}
class Circle implements Printable
{
	private double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public void print()
	{
		System.out.println("Circle Objects");
		//for(int i=0;i<p.length;i++)
			//System.out.println("Radius is : +"p[i].radius);
	}
}

class Employee implements Printable
{
	private int id;
	public Employee(int id)
	{
		this.id = id;
	}
	public void print()
	{
		System.out.println("Employee Objects");
	}
}

public class PrintableMain
{
	public static void main(String arg[])
	{
		Printable p[] = new Printable[2];
		p[0] = new Circle(10);
		p[1] = new Employee(1);
		printAll(p);
	}
	public static void printAll(Printable pp[])
	{
		for(int i=0;i<pp.length;i++)
			pp[i].print();
	}
}