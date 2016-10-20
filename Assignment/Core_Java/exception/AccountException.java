package exception;

public class AccountException extends Exception
{
	public AccountException()
	{
		System.out.println("Exception...");
	}
	
	public AccountException(String msg)
	{
		System.out.println(msg);
	}
}
