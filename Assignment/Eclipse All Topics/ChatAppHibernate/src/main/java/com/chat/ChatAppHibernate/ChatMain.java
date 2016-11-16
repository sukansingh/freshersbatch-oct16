package com.chat.ChatAppHibernate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ChatMain {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf  = cfg.buildSessionFactory();
		
		
		//Set <String> user = new TreeSet<String>(); //RoomName user pass
		//List <String> msg = new ArrayList<String>(); //RoomName user Msg
		
		
		String uname=null;
		String pass=null;
		String chatroom = null; // chatroom name
		
		Set <ChatRoom> crList = new HashSet<ChatRoom>();
		Set <Message> msgList = new HashSet<Message>();
		Set <User> userList = new HashSet<User>();
		
		User u = new User("Sukan Singh");
		ChatRoom cr = new ChatRoom("Academic");
		Message m = new Message("Hello I'm Sukan Singh");
		
		crList.add(cr);
		msgList.add(m);
		userList.add(u);
		
		u.setChatRoomList(crList);
		u.setMessageList(msgList);
		
		m.setUser(u);
		m.setChatRoom(cr);
		
		//cr.setMessageList(msgList);
		//cr.setUserList(userList);
		
		 Session s = sf.openSession();
		 Transaction t = s.beginTransaction();
		 s.save(u);
		 s.save(cr);
		 s.save(m);
		
		 t.commit();
		
		while(true)
		{
		System.out.println("Options : ");
		
		System.out.println("1) User login");
		System.out.println("2) Create a chatroom");
		System.out.println("3) Add the user");
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
			 System.out.println("Enter username : ");
			 uname = sc.next();
			 System.out.println("Enter password : ");
			 pass = sc.next();
			 Session s1 = sf.openSession();
			 Transaction t1 = s1.beginTransaction();
				
			 String hql = "from userall U where U.u_name=:u_name";  //and U.u_pass=:u_pass";
			 Query query = s1.createQuery(hql);
			 query.setParameter("u_name", uname);
			 //query.setParameter("u_pass", pass);
			 List result = query.list();
			 System.out.println(result);
				
			 s1.close();
			 
			 break; //break main switch
			
		case 2:
			if(uname==null)
			{
				System.out.println("Please login first");
				break; //break main switch
			}
			else
			{
				System.out.println("Enter ChatRoom Name : ");
				chatroom = sc.next();
				
				Session s2 = sf.openSession();
				Transaction t2 = s2.beginTransaction();
				
				String hql2 = "from ChatRoom C where C.r_name=:r_name";
				Query query2 = s2.createQuery(hql2);
				query2.setParameter("r_name", chatroom);
				List result2 = query2.list();
				System.out.println(result2);
				
				s2.close();
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
			
			break;
		case 5:
			if(uname==null)
			{
				System.out.println("Please login first");
				break; //break main switch
			}
			
			break;
		case 6:
			if(uname==null)
			{
				System.out.println("Please login first");
				break; //break main switch
			}
			
			break;
		case 7:
			uname=null;
			pass=null;
			//s=null;
			break;
		case 8:
			if(uname==null)
			{
				System.out.println("Please login first");
				break; //break main switch
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
			//room = sc.next();
			
			break;
		default:
			break;
		}//end of main switch(choice)
	}
	}

}
