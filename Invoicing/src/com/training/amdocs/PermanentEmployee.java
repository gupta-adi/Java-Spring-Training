package com.training.amdocs;

public class PermanentEmployee extends Employee{
	
	private double baseSal;
	
	private double pf;
	
	public PermanentEmployee() {
		
	}
	
	public PermanentEmployee(int empId, String empname, String dept) {
		super();
		System.out.println("Base class Constructor");
		
	}

	public double getBaseSal() {
		return baseSal;
	}

	public void setBaseSal(double baseSal) {
		this.baseSal = baseSal;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

}
