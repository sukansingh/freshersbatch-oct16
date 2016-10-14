import java.util.Scanner;
public class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. to check armstrong or not: ");
		int n = sc.nextInt();
		int temp = n;
		int arm=0;
		while(n>0)
		{
			int a = n%10;
			arm = arm+(a*a*a);
			n = n/10;
		}
		if(temp==arm)
		{
			System.out.println("no. is Armstrong");
		}
		else
			System.out.println("no. is NOT Armstrong");
	}
}