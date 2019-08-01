package com.fdmgroup.bankaccounts;

public class BankAccount {

	private int accountNumber;
	private String accountName;
	private double balance;
	private AccountHolder accountHolder;

	public BankAccount() {

	}

	public BankAccount(int accountNumber, String accountName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}

	// right click-source-generate getters and setters

	public AccountHolder getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(AccountHolder accountHolder) {
		this.accountHolder = accountHolder;
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

	public void deposit(double amount) {
		balance = balance + amount;

	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		}
	}

	public String toString() {
		String str = accountName + ", " + accountNumber + ", " + balance;
		return str;
	}

}
