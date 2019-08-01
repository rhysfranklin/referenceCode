package com.fdmgroup.abstractclass;

public abstract class PersonalAccount extends Account {
	private PersonalAccountHolder accountHolder;

	public PersonalAccount(long accountNumber, double balance, PersonalAccountHolder accountHolder) {
		super(accountNumber, balance);
		this.accountHolder = accountHolder;
	}

	public PersonalAccountHolder getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(PersonalAccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	
	
	
	

}
