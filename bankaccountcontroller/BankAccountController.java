package com.fdmgroup.bankaccountcontroller;

import java.util.ArrayList;

import com.fdmgroup.bankaccounts.BankAccount;

public class BankAccountController {
	private ArrayList<BankAccounts> listOfAccounts = new ArrayList<BankAccounts>();

	public int numberOfAccounts() {

		return listOfAccounts.size();
	}

	public void add(BankAccounts bankAccount) {
		listOfAccounts.add(bankAccount);
	}

	public void addBankAccount(BankAccounts bankAccount) {
		for (BankAccounts eachAccount : listOfAccounts) {
			if (eachAccount.getAccountNumber() == bankAccount.getAccountNumber()) {
				return;
			}
		}
		listOfAccounts.add(bankAccount);

	}

	public void removeBankAccount(int bankAccount) {
		for (BankAccounts eachAccount : listOfAccounts) {
			if (eachAccount.getAccountNumber() == bankAccount) {
				listOfAccounts.remove(eachAccount);
				break;
			}
		}
		
	}

	public BankAccounts getAccount(int accountNumber) {
		BankAccounts bankAccount = null;
		for (BankAccounts eachAccount : listOfAccounts) {
			if (eachAccount.getAccountNumber() == accountNumber) {
				bankAccount = eachAccount;
			}
		}
		return bankAccount;



	}

	public String retrieveAccountNames(int accountNumber) {
		String bankAccount = null;
		for (BankAccounts eachAccount : listOfAccounts) {
			if (eachAccount.getAccountNumber() == accountNumber) {
				bankAccount = eachAccount.getAccountName();
			}
		}
		return bankAccount;
		

		
	}
}