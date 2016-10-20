public class StringTest
{
	public static void main(String arg[])
	{
		String s1 = "hello";
		String s2 = "hello";
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		if(s1==s2)
		{
			System.out.println("Yes , s1==s2");
		}
		if(s1==s3)
		{
			System.out.println("Yes , s1==s3");
		}
		else
		{
			System.out.println("No , s1==s3");
		}
		if(s3==s4)
		{
			System.out.println("Yes , s3==s4");
		}
		else
		{
			System.out.println("No , s3==s4");
		}
		if(s1.equals(s3) && s3.equals(s4))
		{
			System.out.println("Yes , s3 equals s4 && s1 equals s3");
		}
	}
}