package com.training.amdocs;

public class Account {

	private long acctNumber;
	private String acctHolderName;
	private String acctType;
	
	public Account(long acctNumber, String acctHolderName, String acctType) {
		super();
		this.acctNumber = acctNumber;
		this.acctHolderName = acctHolderName;
		this.acctType = acctType;
	}
	
	public long getAcctNumber() {
		return acctNumber;
	}
	public void setAcctNumber(long acctNumber) {
		this.acctNumber = acctNumber;
	}
	public String getAcctHolderName() {
		return acctHolderName;
	}
	public void setAcctHolderName(String acctHolderName) {
		this.acctHolderName = acctHolderName;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	
	
	
}
