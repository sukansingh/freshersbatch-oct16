package com.chat.ChatAppHibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Message")
public class Message 
{
	@Id
	@GeneratedValue
	@Column(name="msg_id")
	private int msg_id;
	
	@Column(name="msg")
	private String msg;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="u_id")
	private User user;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="r_id")
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
