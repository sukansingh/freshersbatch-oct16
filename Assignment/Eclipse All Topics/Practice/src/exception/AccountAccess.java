package exception;

import java.util.Scanner;
class Account
{
	private int bal;
	public Account()
	{
		bal = 0;
	}
	public int getBalance()
	{
		return bal;
	}
	public boolean deposit(int amt)
	{
		bal += amt;
		return true;
	}
	public boolean withdraw(int amt) throws AccountException
	{
		if(bal < amt)
		{
			throw new AccountException("Not enough balance!! ur balance is : "+bal);
		}
		bal -= amt;
		return true;
	}
}
public class AccountAccess
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Show Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("Enter ur Choice : ");
		Account a = new Account();
		int ch = sc.nextInt();
		int amt=0;
		switch(ch)
		{
			case 1: 
				System.out.println(a.getBalance());
				break;
			case 2:
				System.out.println("Enter amount to deposite : ");
				 amt = sc.nextInt();
				a.deposit(amt);
				System.out.println(a.getBalance());
				break;
			case 3:
				System.out.println("Enter amount to withdraw : ");
				 amt = sc.nextInt();
				try 
				{
					a.withdraw(amt);
				} 
				catch (AccountException e) 
				{
					//e.printStackTrace();
				}
				System.out.println(a.getBalance());
				break;
			default:
				System.out.println("Wrong Choice!!!");
		}
	}
}