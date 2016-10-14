import java.util.Scanner;
public class Result
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+(i+1)+" Subject Marks : ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > 60)
			{
				count++;
			}
		}
		if(count==3)
		{
			System.out.println("You are Passed...");
		}
		else if(count==2)
		{
			System.out.println("You are Promoted...");
		}
		else
		{
			System.out.println("You are failed !!!");
		}
	}
}