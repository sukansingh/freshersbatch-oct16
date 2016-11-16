package annotation;

class SampleBase
{
	private int x;
	public SampleBase()
	{
		this.x=10;	
	}
	public int get()
	{
		return this.x;
	}
}
class SampleChild extends SampleBase
{
	public SampleChild()
	{
		super();	
	}
	@Override
	public int get()
	{
		return 20;
	}
	//@Deprecated
	@SuppressWarnings(value="SuppressedWarnings of print()")
	public void print()
	{
		System.out.println("Print SampleChild");
	}
}
public class Sample {

	public static void main(String[] args) 
	{
		SampleChild s = new SampleChild();
		
		s.print();
	}

}
