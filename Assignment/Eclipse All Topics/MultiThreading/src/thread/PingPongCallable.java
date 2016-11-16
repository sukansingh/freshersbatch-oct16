package thread;

import java.util.concurrent.*;
public class PingPongCallable
{
	
	Callable<Void> c1 = new Callable<Void>()
	{
		@Override
		public Void call() throws Exception 
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
			return null;
		}
	};
	Callable<Void> c2 = new Callable<Void>()
	{
		@Override
		public Void call() throws Exception 
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
			return null;
		}
	};
	Callable<Void> c3 = new Callable<Void>()
	{
		@Override
		public Void call() throws Exception 
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
			return null;
		}
	};
	
	
	ExecutorService ex = Executors.newFixedThreadPool(3);
	public PingPongCallable()
	{
		
		Future <Void> future1 = ex.submit(c1);
		Future <Void> future2 = ex.submit(c2);
		Future <Void> future3 = ex.submit(c3);
		
		//ex.execute(r1);ex.execute(r2);ex.execute(r3);
		ex.shutdown();
	}

	public static void main(String[] args)
	{
		PingPongCallable p = new PingPongCallable();

	}

	

}
