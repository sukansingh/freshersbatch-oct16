package com.vehicle.VehicleInheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value="bike")
@AttributeOverrides({
	@AttributeOverride(name="v_id", column=@Column(name="v_id")),
	@AttributeOverride(name="cost", column=@Column(name="cost"))
})
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
