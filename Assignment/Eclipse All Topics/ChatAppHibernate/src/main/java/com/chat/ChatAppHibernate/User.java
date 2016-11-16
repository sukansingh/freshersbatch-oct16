package com.chat.ChatAppHibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="UserAll")
public class User 
{
	@Id
	@GeneratedValue
	@Column(name="u_id")
	private int u_id;
	
	@Column(name="u_name")
	private String u_name;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="User_ChatRoom",
		joinColumns={@JoinColumn(name="u_id")},
		inverseJoinColumns={@JoinColumn(name="r_id")})
	private Set <ChatRoom> chatRoomList = new HashSet<ChatRoom>();
	
	@OneToMany(mappedBy="user",cascade={CascadeType.ALL})
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
