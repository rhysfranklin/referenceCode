package com.fdmgroup.tax;

public class TaxCalculator {

	public String taxPercentage(int salary) {
		String percentage = null;
		if (salary <= 10000) { // Checks if salary is below 10000
			percentage = "10%";
		} else if (salary <= 20000) { // Checks if salary is below 20000
			percentage = "20%";
		} else if (salary <= 30000) { // Checks if salary is below 30000
			percentage = "30%";
		} else if (salary <= 40000) { // Checks if salary is below 30000
			percentage = "40%";
		}
		return percentage;

	}

}
