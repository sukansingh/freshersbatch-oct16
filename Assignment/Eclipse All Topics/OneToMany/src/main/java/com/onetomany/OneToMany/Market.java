 package com.onetomany.OneToMany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="MARKET")
public class Market 
{
	@Id
	@GeneratedValue
	@Column(name="m_id")
	private Long id;
	
	@Column(name="name")
	private String name;

	@OnDelete(action=OnDeleteAction.CASCADE)
	@OneToMany(mappedBy="market", cascade={CascadeType.ALL})
	private Set<Stock> stocks;
	
	public Market(){}
	public Market(String name)
	{
		this.name = name;
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

	public Set<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(Set<Stock> stocks) {
		this.stocks = stocks;
	}

	public String toString() {
		return id + " - " + name + " - " + stocks;
	}
}
