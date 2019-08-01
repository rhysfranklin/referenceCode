package com.fdmgroup.abstractclass;

public class SavingsAccount extends PersonalAccount {
	private static double interestRate;
	
	public SavingsAccount(long accountNumber, double balance, PersonalAccountHolder accountHolder) {
		super(accountNumber, balance, accountHolder);

	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRateInput) {
	interestRate = interestRateInput;
	}
	
	
	
	

}
