package com.vehicle.TablePerClass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Vehicle")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="type", discriminatorType=DiscriminatorType.STRING)
public class Vehicle 
{
	@Id
	@GeneratedValue
	@Column(name="v_id")
	private int v_id;
	
	@Column(name="cost")
	private int cost;
	
	public Vehicle(){}
	
	public Vehicle(int cost)
	{
		this.cost=cost;
	}
	
	public int getId()
	{
		return v_id;
	}
	public int getCost()
	{
		return cost;
	}
	
	public void setId(int v_id)
	{
		this.v_id = v_id;
	}
	
	public void setCost(int cost)
	{
		this.cost = cost;
	}
	
	public String toString()
	{
		return v_id+" - "+cost;
	}
}
