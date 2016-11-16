package lamdaexpression;

public class ArithmeticOperation
{

	public static void main(String[] args) 
	{
		int x=20;
		int y=10;
		
		Arithmetic r = (a,b) -> (x+y);
		int v = r.result(x, y);
		System.out.println(v);
		
		 r = (a,b) -> (x-y);
		 v = r.result(x, y);
		 System.out.println(v);
		 
		 r = (a,b) -> (x*y);
		 v = r.result(x, y);
		 System.out.println(v);
		 
		 r = (a,b) -> (x/y);
		 v = r.result(x, y);
		 System.out.println(v);
	}


}
