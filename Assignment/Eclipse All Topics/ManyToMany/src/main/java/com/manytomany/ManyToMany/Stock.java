package com.manytomany.ManyToMany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Stock")
public class Stock 
{
	@Id
	@GeneratedValue
	@Column(name="stock_id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="value")
	private int value;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="m_id")
	private Market market;
	
	public Stock(){}
	public Stock(String name,int value)
	{
		this.name = name;
		this.value = value;
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
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	public void setMarket(Market market)
	{
		this.market = market;
	}
	public Market getMarket()
	{
		return market;
	}
	public String toString() {
		return id + " - " + name + " - " + value;
	}
}
