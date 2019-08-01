package com.fdmgroup.stringcalculator;

import java.util.ArrayList;

public class StringCalculator {

	public int add(String numbers) {
		int sum = 0;
		String[] listOfIntegers = numbers;
		if (numbers.contains("\n")) {
			listOfIntegers = numbers.split("\n");
		} else if (numbers.contains(",")) {
			listOfIntegers = numbers.split(",");
		} else if (numbers.isEmpty()) {
			return 0;
		}
		for (String number : listOfIntegers) {
			int num = Integer.parseInt(number);
			sum += num;
		}
		return sum;
	}
}
