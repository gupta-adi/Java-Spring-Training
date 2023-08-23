package com.training.amdocs;

public class Student {
	
	private int studID;
	private String name;
	private String address;
	private int age;
	
	@Override
	public String toString() {
		
		return "Student [studID=" + studID + ", name=" + name + ", address=" + address + ", age=" + age + " years]";
	}
	
	public Student() {
		
	}
	
	public Student(int studID, String name, String address) {
		this.studID = studID;
		this.name = name;
		this.address = address;
//		if(age>20)
//			this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>20)
		this.age = age;
	}

	public int getStudID() {
		return studID;
	}
	public void setStudID(int studID) {
		this.studID = studID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	
	
	
}
