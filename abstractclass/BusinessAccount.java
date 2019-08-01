package com.fdmgroup.abstractclass;

public class BusinessAccount extends Account {

	private BusinessAccountHolder accountHolder;
	private static double interestRate;

	// constructor
	public BusinessAccount(long accountNumber, double balance, BusinessAccountHolder accountHolder) {
		super(accountNumber, balance);
		this.accountHolder = accountHolder;
	}

	// getters and setters
	public BusinessAccountHolder getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(BusinessAccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRateInput) {
		interestRate = interestRateInput;
	}
	

	

}
