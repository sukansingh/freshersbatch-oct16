package thread;

public class PingPongTest implements Runnable
{
	Thread t1,t2,t3;
	public PingPongTest()
	{
		t1 = new Thread(this);
		t2 = new Thread(this);
		t3 = new Thread(this);
		
		t1.setName("PING");
		t2.setName("PONG");
		t3.setName("TONG");
		
		t1.start();
		t2.start();
		t3.start();
	}
	public void run() 
	{
		Thread curr = Thread.currentThread();
		if(curr.getName().equals("PING"))
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("PING");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {}
			}
		}
		else if(curr.getName().equals("PONG"))
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("\tPONG");
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {}
			}
		}
		else if(curr.getName().equals("TONG"))
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("\t\tTONG");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
		}
	}

	public static void main(String[] args)
	{
		PingPongTest p = new PingPongTest();

	}

}
