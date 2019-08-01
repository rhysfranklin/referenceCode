package com.fdmgroup.abstractclass;

public class BusinessRunner {

	public static void main(String[] args) {
		
		BusinessAccountHolder businessHolder = new BusinessAccountHolder("ABC Computers plc", 123, "AB1 2CD", "02087654321", "Electronics", 123456);
		System.out.println(businessHolder.getName());
		System.out.println(businessHolder.getId());
		System.out.println(businessHolder.getPostcode());
		System.out.println(businessHolder.getTelephone());
		System.out.println(businessHolder.getBusinessType());
		System.out.println(businessHolder.getVatNumber());
		
		BusinessAccountHolder businessHolder2 = new BusinessAccountHolder("XYZ Cars", 456, "CD4 5EF", "02076543210", "Car manufactuer", 987654);
		System.out.println(businessHolder2.getName());
		System.out.println(businessHolder2.getId());
		System.out.println(businessHolder2.getPostcode());
		System.out.println(businessHolder2.getTelephone());
		System.out.println(businessHolder2.getBusinessType());
		System.out.println(businessHolder2.getVatNumber());
		
		PersonalAccountHolder personalHolder2 = new PersonalAccountHolder("Jane Jones", 987, "MN6 7PR", "01764986745",
				"AB 34 56 78 C");
		System.out.println(personalHolder2.getName());
		System.out.println(personalHolder2.getId());
		System.out.println(personalHolder2.getPostcode());
		System.out.println(personalHolder2.getTelephone());
		System.out.println(personalHolder2.getNationalInsuranceNumber());
		
		PersonalAccountHolder personalHolder1 = new PersonalAccountHolder("John Smith", 789, "GH5 6KL", "01985876123",
				"CD 12 34 56 E");
		System.out.println(personalHolder1.getName());
		System.out.println(personalHolder1.getId());
		System.out.println(personalHolder1.getPostcode());
		System.out.println(personalHolder1.getTelephone());
		System.out.println(personalHolder1.getNationalInsuranceNumber());
		
		
		
		//new business accounts
		BusinessAccount businessAccount1 = new BusinessAccount(123456789, 1500000, businessHolder);
		BusinessAccount businessAccount2 = new BusinessAccount(987654321, 750000, businessHolder);
		BusinessAccount businessAccount3 = new BusinessAccount(123454321, 5000000, businessHolder2);
		
		//new savings account
		SavingsAccount savingAccount1 = new SavingsAccount(543212345, 2500, personalHolder1);
		SavingsAccount savingAccount2 = new SavingsAccount(987656789, 1500, personalHolder2);
		
		//new current accounts
		CurrentAccount currentAccount1 = new CurrentAccount(857649372, 350.75, personalHolder1, 250.0);
		CurrentAccount currentAccount2 = new CurrentAccount(375846397, 1750.32, personalHolder2, 500);
		
		//setting interest rates
		BusinessAccount.setInterestRate(10.0);
		SavingsAccount.setInterestRate(5.0);
		
		
		
		
		//printing out the interest rates
		System.out.println(BusinessAccount.getInterestRate());
		System.out.println(SavingsAccount.getInterestRate());
		
		//printing business account1
		BusinessAccountHolder businessAccount1Holder = businessAccount1.getAccountHolder();
		System.out.println(businessAccount1Holder.getName());
		System.out.println(businessAccount1.getACCOUNTNUMBER());
		System.out.println(businessAccount1.getBalance());
		
		//printing business account2
		BusinessAccountHolder businessAccount2Holder = businessAccount2.getAccountHolder();
		System.out.println(businessAccount2Holder.getName());
		System.out.println(businessAccount2.getACCOUNTNUMBER());
		System.out.println(businessAccount2.getBalance());
		
		//printing business account3
		BusinessAccountHolder businessAccount3Holder = businessAccount3.getAccountHolder();
		System.out.println(businessAccount3Holder.getName());
		System.out.println(businessAccount3.getACCOUNTNUMBER());
		System.out.println(businessAccount3.getBalance());
	
		//printing savings account1
		PersonalAccountHolder SavingsAccount1Holder = savingAccount1.getAccountHolder();
		System.out.println(SavingsAccount1Holder.getName());
		System.out.println(savingAccount1.getACCOUNTNUMBER());
		System.out.println(savingAccount1.getBalance());
		
		//printing savings account2
		PersonalAccountHolder SavingsAccount2Holder = savingAccount2.getAccountHolder();
		System.out.println(SavingsAccount2Holder.getName());
		System.out.println(savingAccount2.getACCOUNTNUMBER());
		System.out.println(savingAccount2.getBalance());
		
		//printing current account1
		PersonalAccountHolder CurrentAccount1Holder = currentAccount1.getAccountHolder();
		System.out.println(CurrentAccount1Holder.getName());
		System.out.println(currentAccount1.getACCOUNTNUMBER());
		System.out.println(currentAccount1.getBalance());
		System.out.println(currentAccount1.getOverdraftLimit());
		
		//printing current account2
		PersonalAccountHolder CurrentAccount2Holder = currentAccount2.getAccountHolder();
		System.out.println(CurrentAccount2Holder.getName());
		System.out.println(currentAccount2.getACCOUNTNUMBER());
		System.out.println(currentAccount2.getBalance());
		System.out.println(currentAccount2.getOverdraftLimit());
		
	
		
		

		
				
		


	}

}
