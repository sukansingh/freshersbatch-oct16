package com.spring.rest;

public class User 
{
	private String username;
	
	private String password;
	
	public User(){}
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswor() {
		return password;
	}

	public void setPasswor(String passwor) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", passwor=" + password + "]";
	}
	
	
	
}
