package com.onetoone.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer 
{
	@Id
	@GeneratedValue
	@Column(name="cust_id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name="enq_id")
	private Enquiry enquiry;
	
	//public Customer(){}
	public Customer(String name, Enquiry enquiry)
	{
		this.name = name;
		this.enquiry = enquiry;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Enquiry getEnquiry() {
		return enquiry;
	}

	public void setEnquiry(Enquiry enquiry) {
		this.enquiry = enquiry;
	}

	public String toString() {
		return id + " - " + name + " - " + enquiry;
	}
}
