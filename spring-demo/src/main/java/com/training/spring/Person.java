package com.training.spring;

public class Person {
	private String fName, lName;
	private int age;
	
	private Car myCar;
	
	public Person(int age) {
		this.age=age;
	}
	public Car getMyCar() {
		return myCar;
	}
	public void setMyCar(Car myCar) {
		this.myCar = myCar;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPersonDetail() {
		return this.fName + ":"+myCar.getCarDetail();
	}

}
