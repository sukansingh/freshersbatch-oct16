package thread;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WaterTank2 extends Frame implements Runnable
{
	Thread inlet,outlet,controller;
	int y1 = 200, yht = 200, per = 70;
	public WaterTank2() 
	{
		super("Water Tank");
		
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		inlet = new Thread(this);
		outlet = new Thread(this);
		controller = new Thread(this);
		
		inlet.setName("inlet");
		outlet.setName("outlet");
		controller.setName("controller");
		
		controller.setDaemon(true);
		
		inlet.start();
		outlet.start();
		controller.start();
		
	}
	@Override
	public void run() 
	{
		Thread curr = Thread.currentThread();
		if(curr.getName().equals("inlet"))
		{
			while(true)
			{
				y1 =y1-10;
				yht+=10;
				per++;
				//yht-=10;
				repaint();
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else if(curr.getName().equals("outlet"))
		{
			while(true)
			{
				y1 =y1+10;
				yht-=10;
				per--;
				//yht-=10;
				repaint();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else if(curr.getName().equals("controller"))
		{
			while(true)
			{
				if(per >= 80)
				{
					inlet.suspend();
					outlet.resume();
				}
				else if(per <= 70)
				{
					outlet.suspend();
					inlet.resume();
				}
				else
				{
					inlet.resume();
					outlet.resume();
				}
			}
		}
		
	}
		
	public void paint(Graphics g) {
		g.drawRect(150, 100, 200, 300);
		g.setColor(Color.RED);
		g.fillRect(150, y1, 200, yht);
		g.drawString(per+"%", 380, 200);
	}

	public static void main(String[] args) {
		Frame mf = new WaterTank2();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}

}
