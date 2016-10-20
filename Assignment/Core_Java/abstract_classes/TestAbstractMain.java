abstract class TestAbstract
{
	 public abstract void f1();
	 public abstract void f2();//{}
	 public void f3(){}
}

class A extends TestAbstract
{
	public void f1(){}
}

class TestAbstractMain
{
	public static void main(String arg[])
	{
		//TestAbstract t = new TestAbstract();
	}
}