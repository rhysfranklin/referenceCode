package com.fdmgroup.abstractclass;

public abstract class Account {

	private long ACCOUNTNUMBER;
	private double balance;

	// constructor
	public Account(long accountNumber, double balance) {
		super();
		ACCOUNTNUMBER = accountNumber;
		this.balance = balance;
	}

	// getter and setters
	public long getACCOUNTNUMBER() {
		return ACCOUNTNUMBER;
	}

	public void setACCOUNTNUMBER(long aCCOUNTNUMBER) {
		ACCOUNTNUMBER = aCCOUNTNUMBER;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// methods

	public void addFunds(double amount) {
		if (amount > 0) {
			balance += amount;
		}

	}

	public double withdrawFunds(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			return amount;
		} else {
			return 0;
		}

	}

}
