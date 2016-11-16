package com.vehicle.VehicleInheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value="car")
@AttributeOverrides({
	@AttributeOverride(name="v_id", column=@Column(name="v_id")),
	@AttributeOverride(name="cost", column=@Column(name="cost"))
})
public class Car extends Vehicle
{
	@Column(name="c_type")
	private String c_type;
	
	public Car(){}
	
	public Car(int cost,String c_type)
	{
		super(cost);
		this.c_type = c_type;
	}
	
	public String getC_Type()
	{
		return c_type;
	}
	
	public void setC_type(String c_type)
	{
		this.c_type = c_type;
	}
}
