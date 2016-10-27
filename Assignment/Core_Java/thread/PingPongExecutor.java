package thread;

import java.util.concurrent.*;
public class PingPongExecutor
{
	
	Runnable r1 = new Runnable() 
	{
			
		@Override
		public void run() 
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("PING");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
			}
		}
	};
	Runnable r2 = new Runnable() 
	{
			
		@Override
		public void run() 
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("\tPONG");
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
			}
		}
	};
	Runnable r3 = new Runnable() 
	{
			
		@Override
		public void run() 
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("\t\tTONG");
				try {
					Thread.sleep(120);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
			}
		}
	};
	
	ExecutorService ex = Executors.newFixedThreadPool(3);
	public PingPongExecutor()
	{
		
		ex.submit(r1);
		ex.submit(r2);
		ex.submit(r3);
		//ex.execute(r1);ex.execute(r2);ex.execute(r3);
		ex.shutdown();
	}

	public static void main(String[] args)
	{
		PingPongExecutor p = new PingPongExecutor();

	}

}
