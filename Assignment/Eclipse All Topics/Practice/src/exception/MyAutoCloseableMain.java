package exception;

class MyAutoCloseable implements AutoCloseable
{

	@Override
	public void close() throws Exception 
	{
		System.out.println("Closing this");
		
	}
	
}

public class MyAutoCloseableMain 
{

	public static void main(String[] args) throws Exception 
	{
		try(MyAutoCloseable m = new MyAutoCloseable();)
		{
			System.out.println("try block");
		}
		catch(Exception e)
		{
			
		}
	}

}
