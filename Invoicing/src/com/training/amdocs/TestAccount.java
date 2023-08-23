package com.training.amdocs;

public class TestAccount {
	
	public static void main(String args[]) {
		SavingsAccount sa1 = new SavingsAccount(101, "Aditya Gupta", "Savings Account", 10000);
		SavingsAccount sa2 = new SavingsAccount(102, "John Doe", "Salary Account", 250000);
		
		System.out.println(sa1);
		System.out.println(sa2);
		
	}
	
}
