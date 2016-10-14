import java.util.Scanner;
public class Login
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int attempt=0;
		while(attempt < 3)
		{
			System.out.println("Enter username : ");
			String username = sc.next();
			System.out.println("Enter password : ");
			String password = sc.next();
			if(username.equals("sukan") && password.equals("singh"))
			{
				System.out.println("Welcome "+username);
				break;
			}
			else
			{
				attempt++;
				System.out.println("wrong username or password");
			}
		}
		if(attempt > 2)
		{
			System.out.println("Contact Admin");
		}
	}
}