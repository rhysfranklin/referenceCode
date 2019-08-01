package com.fdmgroup.bankaccounts;

public class Runner {

	public static void main(String[] args) {
		
		//create new bank account ready for input
		BankAccount bankAccount = new BankAccount();
		
		//set account number and retrieve the account number afterwards
		bankAccount.setAccountNumber(12312443);
		int accNumber = bankAccount.getAccountNumber();
		System.out.println(accNumber);
		
		//set account name into bank account and retrieve the account name afterwards
		bankAccount.setAccountName("Rhys");
		String accName = bankAccount.getAccountName();
		System.out.println(accName);
		
		
		//using a constructor to set all 3 details
		AccountHolder accountHolder = new AccountHolder("Rhys", "Franklin");
		BankAccount rhysAccount = new BankAccount(78323782, "Rhys", 1000.00);
		int rhysAccountNumber = rhysAccount.getAccountNumber();
		String rhysAccountName = rhysAccount.getAccountName();
		double rhysAccountBalance = rhysAccount.getBalance();
		
		System.out.println(rhysAccountNumber);
		System.out.println(rhysAccountName);
		
		rhysAccount.deposit(50);
		rhysAccountBalance = rhysAccount.getBalance();
		System.out.println(rhysAccountBalance);
		
		rhysAccount.withdraw(1000);
		rhysAccountBalance = rhysAccount.getBalance();
		System.out.println(rhysAccountBalance);
		
		
		System.out.println(rhysAccount);
		
		
		CurrentAccount currentAccount = new CurrentAccount(1111, "rhys", 1000.0);
		System.out.println("current account balance is:"+currentAccount.getBalance());
		currentAccount.withdraw(1000);
		System.out.println("current account balance is:"+currentAccount.getBalance());
		currentAccount.withdraw(100);
		System.out.println("current account balance is:"+currentAccount.getBalance());
		currentAccount.withdraw(100);
		System.out.println("current account balance is:"+currentAccount.getBalance());
		currentAccount.withdraw(100);
		String number = "";
		System.out.println(number.length());

	}

}
