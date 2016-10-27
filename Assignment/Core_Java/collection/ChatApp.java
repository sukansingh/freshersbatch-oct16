package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ChatApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		
		Set <String> user = new TreeSet<String>(); //RoomName user pass
		List <String> msg = new ArrayList<String>(); //RoomName user Msg
		//List <String> login = new ArrayList<String>(); //ip
		
		String uname=null;
		String pass=null;
		String s = null; // chatroom name
		
		while(true)
		{
		System.out.println("Options : ");
		
		System.out.println("1) Create a chatroom");
		System.out.println("2) Add the user");
		System.out.println("3) User login");
		System.out.println("4) Send a message");
		System.out.println("5) Display the messages from a specific chatroom");
		System.out.println("6) List down all users belonging to the specified chat room.");
		System.out.println("7) Logout");
		System.out.println("8) Delete an user");
		System.out.println("9) Delete the chat room.");
		
		System.out.println("Please enter your option:");
		
		int choice = sc.nextInt();
		
		
		switch(choice)
		{
		case 1:
			/*
			InetAddress ipAddr = InetAddress.getLocalHost();
			String ip = ipAddr.getHostAddress();
			Iterator<String> itr = login.iterator();
			boolean flag=false;
			while(itr.hasNext())
			{
				if(ip.equals(itr.next()))
				{
					flag = true;
					break;
				}
				
			}
			
			if(flag==false)
			*/
			if(uname==null)
			{
				System.out.println("Please login first");
				break; //break main switch
			}
			else
			{
				System.out.println("Enter ChatRoom Name : ");
				s = sc.next();
				Iterator<String> itr = user.iterator();
				boolean flag=false;
				//boolean flag2=false;
				while(itr.hasNext())
				{
					String str[] = itr.next().split(" ");
					
					if(str[0].equals(s))
					{
						if(str[1].equals(uname) && str[2].equals(pass))
						{
							flag=true;
							System.out.println("you are already in this Chatroom");
						}
						else
						{
							System.out.println("Chatroom Already exist");
							System.out.println("You are added to "+s+" ChatRoom...");
							
						}
						
						break;
					}
					
				}
				if(flag!=true)
				{
					user.add(s+" "+uname+" "+pass);
				}
			}
			break;
		case 2:
			if(uname==null)
			{
				System.out.println("Please login first");
				break; //break main switch
			}
			System.out.println("Enter ChatRoom Name : ");
			
			s = sc.next();
			Iterator<String> itr = user.iterator();
			boolean flag=false;
			//boolean flag2=false;
			while(itr.hasNext())
			{
				String str[] = itr.next().split(" ");
				
				if(str[0].equals(s))
				{
					if(str[1].equals(uname) && str[2].equals(pass))
					{
						flag=true;
						System.out.println("you are already in this Chatroom");
					}
					else
					{
						System.out.println("You are added to "+s+" ChatRoom...");
						user.add(s+" "+uname+" "+pass);
					}
					
					break;
				}
				
			}
			if(flag!=true)
			{
				System.out.println("wrong Chatroom");
			}
			break;
		case 3:
			System.out.println("Enter username : ");
			 uname = sc.next();
			System.out.println("Enter password : ");
			 pass = sc.next();
			 
			 break;
		case 4:
			if(uname==null)
			{
				System.out.println("Please login first");
				break; //break main switch
			}
			if(s.equals("") || s==null)
			{
				System.out.println("please enter into chatroom first...");
				break;
			}
			else
			{
				System.out.println("Enter Message to send : ");
				System.out.println();
				String message = sc.next();
				msg.add(s+" "+uname+" "+message);
				System.out.println("successfully send msg...");
			}
			break;
		case 5:
			if(uname==null)
			{
				System.out.println("Please login first");
				break; //break main switch
			}
			flag=false;
			System.out.println("Enter Chatromm name : ");
			String room = sc.next();
			Iterator<String> itr1 = msg.iterator();
			while(itr1.hasNext())
			{
				flag=true;
				String m = itr1.next();
				if(m.startsWith(room))
				{
					System.out.println(m);  //m.substring(room.length(), m.length())
				}
			}
			if(flag!=true)
				System.out.println("No msges!!!");
			break;
		case 6:
			if(uname==null)
			{
				System.out.println("Please login first");
				break; //break main switch
			}
			flag=false;
			System.out.println("Enter Chatromm name : ");
			 room = sc.next();
			itr1 = user.iterator();
			while(itr1.hasNext())
			{
				flag=true;
				String u = itr1.next();
				if(u.startsWith(room))
				{
					System.out.println(u.substring(room.length(), u.length()));  //m.substring(room.length(), m.length())
				}
			}
			if(flag!=true)
				System.out.println("No msges!!!");
			break;
		case 7:
			uname=null;
			pass=null;
			s=null;
			break;
		case 8:
			if(uname==null)
			{
				System.out.println("Please login first");
				break; //break main switch
			}
			itr1 = user.iterator();
			while(itr1.hasNext())
			{
				String u = itr1.next();
				String str[] = u.split(" ");
				if(uname.equals(str[1]))
				{
					user.remove(u);
				}
			}
			System.out.println("Successfully removed user!!");
			break;
		case 9:
			if(uname==null)
			{
				System.out.println("Please login first");
				break; //break main switch
			}
			System.out.println("Enter Chatroom name : ");
			room = sc.next();
			itr1 = user.iterator();
			Iterator <String> itr2  = msg.iterator();
			while(itr1.hasNext())
			{
				String u = itr1.next();
				if(u.startsWith(room))
				{
					user.remove(u);
				}
			}
			while(itr2.hasNext())
			{
				String u = itr2.next();
				if(u.startsWith(room))
				{
					msg.remove(u);
				}
			}
			break;
		default:
			break;
		}//end of main switch(choice)
	}
	}

}
