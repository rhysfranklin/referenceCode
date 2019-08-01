package com.fdmgroup.abstractclass;

public class CurrentAccount extends PersonalAccount{
	private double overdraftLimit;
	
	public CurrentAccount(long accountNumber, double balance, PersonalAccountHolder accountHolder,
			double overdraftLimit) {
		super(accountNumber, balance, accountHolder);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	
	

}
