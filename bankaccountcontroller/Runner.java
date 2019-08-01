package com.fdmgroup.bankaccountcontroller;

public class Runner {

	public static void main(String[] args) {
		BankAccountController controller = new BankAccountController();
		BankAccounts bankAccount1 = new BankAccounts(12345, "John Smith", 100);
		controller.addBankAccount(bankAccount1);
		System.out.println(bankAccount1.getAccountNumber());

	}

}
