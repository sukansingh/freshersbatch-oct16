//import java.util.Scanner;
public class FindArmstrong
{
	public static void main(String args[])
	{
		for(int i=100;i<=999;i++)
		{
			int n = i;
			int arm=0;
			while(n>0)
			{
				int a = n%10;
				arm = arm+(a*a*a);
				n = n/10;
			}
			if(i==arm)
			{
				System.out.print(i+" ");
			}
		}
	}
}