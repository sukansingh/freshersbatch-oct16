package com.chat.beans;

import java.util.HashSet;
import java.util.Set;

public class User 
{
	
	private int u_id;
	
	
	private String u_name;
	
	
	private Set <ChatRoom> chatRoomList = new HashSet<ChatRoom>();
	
	
	private Set <Message> messageList;
	
	public Set<Message> getMessageList() {
		return messageList;
	}

	public void setMessageList(Set<Message> messageList) {
		this.messageList = messageList;
	}

	public User(){}
	
	public User(String u_name)
	{
		this.u_name = u_name;
	}
	
	public int getU_id()
	{
		return u_id;
	}
	public String getU_name()
	{
		return u_name;
	}
	public Set<ChatRoom> getChatRoomList()
	{
		return chatRoomList;
	}
	
	public void setU_id(int u_id)
	{
		this.u_id = u_id;
	}
	public void setU_name(String u_name)
	{
		this.u_name = u_name;
	}
	
	public void setChatRoomList(Set<ChatRoom> chatRoomList)
	{
		this.chatRoomList = chatRoomList;
	}
	
	@Override
	public String toString()
	{
		return u_id+" - "+u_name+" - "+chatRoomList+" - "+messageList;
	}
}
