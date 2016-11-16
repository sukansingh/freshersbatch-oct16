package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Nqueen 
{

	int a2 = 0, b2 = 1, c2 = 2, d2 = 3, e2 = 4, f2 = 5, g2 = 6, h2 = 7;
	static int i = 1;
	public static boolean isSafePosition(int y1, int y2, int x1, int x2) {
		if(y1 != y2 && x1 != x2) {
			double slope = ((y2 - y1)*1.0) / (x2 - x1);
			if (slope != 1.0 && slope != -1.0) {
				return true;
			}
		}
		return false;
	}
	
	public String Logic(int a)
	{
		String ss="";
		for(int b=0; b<=7; b++) {
			for(int c=0; c<=7; c++) {
				for(int d=0; d<=7; d++) {
					for(int e=0; e<=7; e++) {
						for(int f=0; f<=7; f++) {
							for(int g=0; g<=7; g++) {
								for(int h=0; h<=7; h++) {

									if(isSafePosition(a, b, a2, b2) && isSafePosition(a, c, a2, c2) && isSafePosition(a, d, a2, d2) && isSafePosition(a, e, a2, e2) && isSafePosition(a, f, a2, f2) && isSafePosition(a, g, a2, g2) && isSafePosition(a, h, a2, h2)
										&& isSafePosition(b, c, b2, c2) && isSafePosition(b, d, b2, d2) && isSafePosition(b, e, b2, e2) && isSafePosition(b, f, b2, f2) && isSafePosition(b, g, b2, g2) && isSafePosition(b, h, b2, h2)
											&& isSafePosition(c, d, c2, d2) && isSafePosition(c, e, c2, e2) && isSafePosition(c, f, c2, f2) && isSafePosition(c, g, c2, g2) && isSafePosition(c, h, c2, h2)
												&& isSafePosition(d, e, d2, e2) && isSafePosition(d, f, d2, f2) && isSafePosition(d, g, d2, g2) && isSafePosition(d, h, d2, h2)
													&& isSafePosition(e, f, e2, f2) && isSafePosition(e, g, e2, g2) && isSafePosition(e, h, e2, h2) 
														&& isSafePosition(f, g, f2, g2) && isSafePosition(f, h, f2, h2)
															&& isSafePosition(g, h, g2, h2)) {
										 ss = "Position " + i + ") " + a + " - " + b + " - " + c + " - " + d + " - " + e + " - " + f + " - " + g + " - " + h;
										System.out.println("Position " + i + ") " + a + " - " + b + " - " + c + " - " + d + " - " + e + " - " + f + " - " + g + " - " + h);
										i++;
									}
								}
							}
						}
					}
				}
			}
		}
		return ss;
	}
	Callable <String> call1 = new Callable <String>()
	{

		@Override
		public String call() throws Exception 
		{
			
			int a=0;
			return Logic(a);
			
		}
		
	};
	Callable <String> call2 = new Callable <String>()
	{

		@Override
		public String call() throws Exception 
		{
			
			int a=1;
			return Logic(a);
		}
		
	};
	Callable <String> call3 = new Callable <String>()
	{

		@Override
		public String call() throws Exception 
		{
			int a=2;
			return Logic(a);
		}
		
	};
	
	Callable <String> call4 = new Callable <String>()
	{

		@Override
		public String call() throws Exception 
		{
			
			int a=3;
			return Logic(a);
		}
		
	};
	
	Callable <String> call5 = new Callable <String>()
	{

		@Override
		public String call() throws Exception 
		{
			
			int a=4;
			return Logic(a);
		}
		
	};
	
	Callable <String> call6 = new Callable <String>()
	{

		@Override
		public String call() throws Exception 
		{
			
			int a=5;
			return Logic(a);
		}
		
	};
	
	Callable <String> call7 = new Callable <String>()
	{

		@Override
		public String call() throws Exception 
		{
			
			int a=6;
			return Logic(a);
		}
		
	};
	
	Callable <String> call8 = new Callable <String>()
	{

		@Override
		public String call() throws Exception 
		{
			
			int a=7;
			return Logic(a);
		}
		
	};
	
	
	ExecutorService ex = Executors.newFixedThreadPool(3);
	
	public ArrayList print()
	{
		Future <String> future1 = ex.submit(call1);
		Future <String> future2 = ex.submit(call2);
		Future <String> future3 = ex.submit(call3);
		Future <String> future4 = ex.submit(call4);
		Future <String> future5 = ex.submit(call5);
		Future <String> future6 = ex.submit(call6);
		Future <String> future7 = ex.submit(call7);
		Future <String> future8 = ex.submit(call8);
		
		ex.shutdown();
		
		ArrayList <Future> f = new ArrayList<Future>();
		f.add(future1);
		f.add(future2);
		f.add(future3);
		f.add(future4);
		f.add(future5);
		f.add(future6);
		f.add(future7);
		f.add(future8);
		
		return f;
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
		
		long startTime = System.currentTimeMillis();
		
		Nqueen nn = new Nqueen();
		ArrayList<Future> ll = nn.print();
		/*
		for(int t=0;t<ll.size();t++)
		{
			System.out.println((ll.get(t)).get());
		}
		*/
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken: " + (endTime - startTime) + " milisec");
	}

}
