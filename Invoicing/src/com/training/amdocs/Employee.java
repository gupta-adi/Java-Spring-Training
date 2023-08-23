package com.training.amdocs;

public class Employee {

	private int empId;
	private String empName;
	private String dept;
	
	public Employee() {
		System.out.println("Parent Class default constructor");
	}
	
	public Employee(int empId, String empName, String dept) {
		System.out.println("SUper class parameterized constructor");
		this.empId=empId;
		this.empName=empName;
		this.dept=dept;
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
