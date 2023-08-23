package com.training.amdocs;

public class SavingsAccount extends Account{
	
	private int minBalance;

	public SavingsAccount(long acctNumber, String acctHolderName, String acctType, int minBalance) {
		super(acctNumber, acctHolderName, acctType);
		this.minBalance=minBalance;
		// TODO Auto-generated constructor stub
	}

	public int getMinBalance() {
		return minBalance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [minBalance=" + minBalance + ", getAcctNumber()=" + getAcctNumber()
				+ ", getAcctHolderName()=" + getAcctHolderName() + ", getAcctType()=" + getAcctType() + "]";
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}
	
	
	
}
