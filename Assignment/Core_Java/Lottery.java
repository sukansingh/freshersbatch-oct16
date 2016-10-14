import java.util.Scanner;
public class Lottery
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int lot[] = new int[6];
		int user[] = new int[6];
		int hashLot[] = new int[50];
		int hashUser[] = new int[50];
		for(int i=0;i<6;i++)
		{
			int r = (int)(Math.random()*49)+1;
			if(hashLot[r]==1)
				i--;
			else{
				lot[i] = r;
				System.out.print(r+"  ");
				hashLot[r] = 1;
			}
		}
		
		//for user
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter "+(i+1)+" number : ");
			int temp = sc.nextInt();
			if(hashUser[temp]==1)
				i--;
			else{
				user[i] = temp;
				hashUser[temp] = 1;
			}
			
		}
		
		for(int i=0;i<6;i++)
		{
			if(hashLot[user[i]]==1)
			{
				System.out.println(user[i]+" ");
			}
		}
	}
}