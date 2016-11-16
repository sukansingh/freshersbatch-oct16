import java.util.Arrays;
import java.util.Scanner;

public class AlextAsk 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int result[] = new int[t];
		for(int k=0;k<t;k++)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			int tmp[] = new int[n];
			int hash[] = new int[100000000];
			
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
				tmp[i] = arr[i];
			}
			Arrays.sort(arr);
			Arrays.sort(tmp);
			boolean flag=false;
			int i=0;
			while(flag!=true)
			{
				for(int j=0;j<n;j++)
				{
					if(i!=0)
					{
						tmp[j] += arr[j];
					}
					if(hash[tmp[j]]==1)
					{
						result[k] = tmp[j];
						flag=true;
						break;
					}
					else
						hash[tmp[j]]=1;
				}
				i++;
			}
			

		}//end of test
		for(int i=0;i<t;i++)
		{
			System.out.println(result[i]);
		}
	}

}
