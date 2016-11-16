package com.chat.main;

import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chat.beans.ChatRoom;
import com.chat.beans.Message;
import com.chat.beans.User;

public class ChatMain 
{

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans_Chat.xml");
		
		User u1 = (User) context.getBean("user1");
		User u2 = (User) context.getBean("user2");
		User u3 = (User) context.getBean("user3");
		User u4 = (User) context.getBean("user4");
		
		ChatRoom cr1 = (ChatRoom) context.getBean("chatRoom1");
		ChatRoom cr2 = (ChatRoom) context.getBean("chatRoom2");
		
		Message m1 = (Message)context.getBean("message1");
		Message m2 = (Message)context.getBean("message2");
		Message m3 = (Message)context.getBean("message3");
		Message m4 = (Message)context.getBean("message4");
		
		/*
		Set <Message> msgList1 = cr1.getMessageList();
		Set <Message> msgList2 = cr2.getMessageList();
		
		Set <User> userList1 = cr1.getUserList();
		Set <User> userList2 = cr1.getUserList();
		
		for(Message mm:msgList1)
			System.out.println(mm.getMsg());
		for(Message mm:msgList2)
			System.out.println(mm.getMsg());
		*/
		
		//System.out.println("ChatRoom is : "+m1.getChatRoom());
		System.out.println(m1.getChatRoom().getR_name()+" : "+m1.getUser().getU_name()+" : "+m1.getMsg());
		System.out.println(m2.getChatRoom().getR_name()+" : "+m2.getUser().getU_name()+" : "+m2.getMsg());
		System.out.println(m3.getChatRoom().getR_name()+" : "+m3.getUser().getU_name()+" : "+m3.getMsg());
		System.out.println(m4.getChatRoom().getR_name()+" : "+m4.getUser().getU_name()+" : "+m4.getMsg());
		
		
	}

}
