package com.spring.aop.SpringAOPUserActivities;

public class User 
{
	private String loginName;
	
	private String password;
	
	private String firstName;
	
	private String country;
	
	public User(){}
	
	
	public User(String loginName, String password, String firstName, String country) {
		super();
		this.loginName = loginName;
		this.password = password;
		this.firstName = firstName;
		this.country = country;
	}


	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "User [loginName=" + loginName + ", password=" + password + ", firstName=" + firstName + ", country="
				+ country + "]";
	}
	
	
}
