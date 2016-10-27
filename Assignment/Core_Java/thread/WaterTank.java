package thread;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WaterTank extends Frame
{
	Thread inlet,outlet,controller;
	int y1 = 200, yht = 200, per = 70;
	public WaterTank() 
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
		System.out.println("inlet therad");
			inlet = new Thread(new Runnable()
					{
	
						@Override
						public void run() 
						{
							
							while(true)
							{
								y1 =y1-10;
								yht+=10;
								per++;
								//yht-=10;
								repaint();
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
						
					});
			inlet.start();
			
			outlet = new Thread(new Runnable()
			{

				@Override
				public void run() 
				{
					while(true)
					{
						y1 =y1+10;
						per--;
						yht-=10;
						//yht-=10;
						repaint();
						try {
							Thread.sleep(700);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
			});
			outlet.start();
			
			controller = new Thread(new Runnable()
			{

				@Override
				public void run() 
				{
					while(true)
					{
						if(per > 80)
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
				
			});
			controller.setDaemon(true);
			controller.start();
		
	}
	
		
	public void paint(Graphics g) {
		g.drawRect(150, 100, 200, 300);
		g.setColor(Color.RED);
		g.fillRect(150, y1, 200, yht);
		g.drawString(per+"%", 380, 200);
	}

	public static void main(String[] args) {
		Frame mf = new WaterTank();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}

}
