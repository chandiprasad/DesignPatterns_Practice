package com.jvm.verify;

public class JVMVerify {
	
	private String name;
	private String lastName;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setVerify(String name,String lastName){
		setName(name);
		setLastName(lastName);
		System.out.println("The serVerify info is  : "+getName()+" : "+getLastName());
	}
	
//	public void setVerify(){
//		setName("Java");
//		setLastName("JVM");
//		System.out.println("The serVerify info is  : "+getName()+" : "+getLastName());
//	}

}
