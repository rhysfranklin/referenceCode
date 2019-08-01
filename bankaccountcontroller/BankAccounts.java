package com.fdmgroup.bankaccountcontroller;

public class BankAccounts{
	private int accountNumber;
	private String accountName;
	private double balance;
	
	public BankAccounts(int accountNumber, String accountName, double balance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
