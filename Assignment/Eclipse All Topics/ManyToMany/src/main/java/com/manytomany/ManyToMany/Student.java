package com.manytomany.ManyToMany;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Student 
{
	@Id
	@GeneratedValue
	@Column(name="s_id")
	private int s_id;
	
	@Column(name="name")
	private String name;
	
	@
	private Course course;
}
