package com.sample;


import java.util.Date;

public final class Person {
	
	private  String name;
	private  Date dob;
	private int id;
	
	public Person(String name,Date dob,int id){
		this.name= name;
		this.dob = new Date(dob.getTime());
		this.id=id;
	}
   
	public String getName(){
		return this.name;
	}
	
	public Date getDob(){
		return (Date) dob.clone();
	}

	public int getId() {
		return id;
	}
	
}
