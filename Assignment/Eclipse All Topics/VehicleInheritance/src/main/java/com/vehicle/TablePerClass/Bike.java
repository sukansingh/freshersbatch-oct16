package com.vehicle.TablePerClass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="bike")
public class Bike extends Vehicle
{
	@Column(name="B_type")
	private String B_type;
	
	public Bike(){}
	
	public Bike(int cost,String B_type)
	{
		super(cost);
		this.B_type = B_type;
	}
	
	public String getB_type()
	{
		return B_type;
	}
	
	public void setB_type(String B_type)
	{
		this.B_type = B_type;
	}
}
