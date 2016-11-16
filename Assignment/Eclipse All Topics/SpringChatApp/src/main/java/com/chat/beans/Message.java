package com.chat.beans;


public class Message 
{
	
	private int msg_id;
	
	
	private String msg;
	
	private User user;
	
	
	private ChatRoom chatRoom;
	
	public Message(){}
	public Message(String msg)
	{
		this.msg = msg;
	}
	
	
	public int getMsg_id() {
		return msg_id;
	}

	public void setMsg_id(int msg_id) {
		this.msg_id = msg_id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ChatRoom getChatRoom() {
		return chatRoom;
	}

	public void setChatRoom(ChatRoom chatRoom) {
		this.chatRoom = chatRoom;
	}
	
	
}
