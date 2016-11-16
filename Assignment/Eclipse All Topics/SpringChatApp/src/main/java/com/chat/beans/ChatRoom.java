package com.chat.beans;

import java.util.HashSet;
import java.util.Set;


public class ChatRoom 
{
	
	private int r_id;
	
	
	private String r_name;
	
	
	private Set <User> userList = new HashSet<User>();
	
	
	private Set <Message> messageList;
	
	public Set<Message> getMessageList() {
		return messageList;
	}

	public void setMessageList(Set<Message> messageList) {
		this.messageList = messageList;
	}

	public ChatRoom(){}
	
	public ChatRoom(String r_name)
	{
		this.r_name = r_name;
	}
	
	public int getR_id() {
		return r_id;
	}
	public Set<User> getUserList()
	{
		return userList;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public String getR_name() {
		return r_name;
	}

	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public void setUserList(Set<User> userList)
	{
		this.userList = userList;
	}
	
	public String toString()
	{
		return r_id+" - "+r_name+" - "+userList+" - "+messageList;
	}
}
