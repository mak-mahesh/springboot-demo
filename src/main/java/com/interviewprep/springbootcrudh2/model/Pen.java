package com.interviewprep.springbootcrudh2.model;
/**
*
*@author admin
*@version 1.0
*
*/
public class Pen{

	private long id;
	private String brand;
	private String color;

	public Pen(long id,String brand,String color){
		this.id = id;
		this.brand = brand;
		this.color = color;
	}

	public long getId(){
		return id;	
	}

	public void setId(long id){
		this.id = id;
	}
	
}
