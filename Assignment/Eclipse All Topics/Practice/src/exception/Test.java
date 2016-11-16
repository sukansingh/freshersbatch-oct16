package exception;

public class Test {

	public static void main(String[] args) 
	{
		int x=10;
		int y=10;
		try
		{
			int r = x/y;
			int a[] = new int[2];
			a[4] = 10;
			System.out.println(r);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		finally
		{
			System.out.println("Direct finally block");
		}
		
	}

}
