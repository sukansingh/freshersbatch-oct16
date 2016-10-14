import java.util.Scanner;
public class DisplayTable
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. which u want to print table : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.print((n*i)+",");
		}
	}
}