package thread;
class Ping extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("PING");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {}
		}
	}
}
class Pong extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("\tPONG");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
public class PingPongTest2 extends Thread
{
	public PingPongTest2(Thread curr)
	{
		
		
	}
	public static void main(String[] args)
	{
		
		//PingPongTest2 p = PingPongTest2();
		
	}

}
