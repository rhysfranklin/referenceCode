package com.fdmgroup.firstproject;

public class FirstProgram {

	public static void main(String[] args) {

		// int age = 0;
		//
		// //double salary = 1000.0;
		//
		// boolean valid = true;
		//
		// System.out.println(age);
		//
		// System.out.println("Salary is: " + salary);
		//
		// if (valid == true) {
		// System.out.println("valid is true");
		// } else if (valid == false) {
		// System.out.println("it was false");
		// } else {
		// System.out.println("valid is false");
		// }

		// ctrl + / with comment out highlighted text

		// int counter = 0;
		//
		// for(counter=0;counter<1000;counter++){
		// System.out.println("counter is: "+counter);
		// }
		//
		// for (counter = 100; counter > 0; counter -= 2) {
		// System.out.println("counter is: " + counter);
		// }
		//
		// counter=0;
		// while(counter<1000){
		// System.out.println("counter is: "+counter);
		// counter++;
		// }

		String firstString = "hello World";
		System.out.println(firstString);

		String firstName = "Rhys";
		String secondName = "Franklin";
		String fullName = firstName + " " + secondName;
		System.out.println(fullName);

		System.out.println("hello " + firstName + " keep up the good work");

		int nameLength = firstName.length();
		String nameUpper = firstName.toUpperCase();
		char firstLetter = firstName.charAt(0);
		char lastLetter = firstName.charAt(nameLength - 1);

		String sentence = "This is a sentence";
		int firstSpace = sentence.indexOf(" ");
		int lastSpace = sentence.lastIndexOf(" ");
		int firstX = sentence.indexOf("x");
		String smallSentence = sentence.substring(0, 4);
		String partSentence = sentence.substring(10);
		String cutSentence = sentence.substring(5, 9);
		boolean containsA = sentence.contains("a");
		boolean containsX = sentence.contains("x");
		String newString = "is " + sentence + "?";

		// question 2
		int number5 = 5;
		int number3 = 3;
		int sum = number5 + number3;
		System.out.println(sum);

		int counter = 0;
		counter += 1;
		counter += 5;
		counter -= 1;
		counter -= 2;
		counter = counter * 2;
		System.out.println(counter);

		int a = 5;
		int b = 2;
		double c = 5;
		double d = 2;
		System.out.println(a / b);
		System.out.println(c / d);
		System.out.println(c / b);
		System.out.println(a / d);

		int code = 98;
		char letter = 'a';
		int letterNum = letter;
		char numberLet = (char) code;
		System.out.println(numberLet);
		System.out.println(letterNum);
		char number36 = 36;
		System.out.println(number36);

		// int char1 = 'a';
		// int char2 = 'c';
		// int char3 = 'z';
		// System.out.println(char2 - char1);
		// System.out.println(char3 - char1);

		// int char1 = 'x';
		// int char2 = 'y';
		// int char3 = 'z';
		// String string1 = "x";
		// String string2 = "y";
		// System.out.println(char1 + char2 + char3);
		// System.out.println(char1 + char2 + string2);
		// System.out.println(char1 + string1 + char3);

		// String number1 = "5";
		// String number2 = "3";

		// System.out.println(Integer.parseInt(number1) +
		// Integer.parseInt(number2));

		String number1 = "5.3";
		String number2 = "3.2";
		System.out.println(Double.parseDouble(number1) + Double.parseDouble(number2));

		String string1 = "abc11";
		String string2 = "9xyz";
		String string3 = "abc7xyz";
		String num1 = string1.replaceAll("[^0-9]", "");
		String num2 = string2.replaceAll("[^0-9]", "");
		String num3 = string3.replaceAll("[^0-9]", "");
		System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3));

		// exercise workbook 2

		// 1.1
		// String alienColour = "yellow";
		// if (alienColour.equals("green")) {
		// System.out.println("player has earned 5 points");
		// } else if (alienColour.equals("red")) {
		// System.out.println("player has earned 10 points");
		// } else if (alienColour.equals("yellow")) {
		// System.out.println("player has earned 15 points");
		// }
		//
		// }
		//
		// }

		// 1.3
		// String alienColour = "yellow";
		// if (alienColour.equals("green")) {
		// System.out.println("player has earned 5 points");
		// } else if (alienColour.equals("red")) {
		// System.out.println("player has earned 10 points");
		// } else if (alienColour.equals("yellow")) {
		// System.out.println("player has earned 15 points");
		// } else {
		// System.out.println("invalid colour");
		// }

		// 1.4
		// int personAge = 3;
		// if (personAge < 2) {
		// System.out.println("baby");
		// } else if (personAge >= 2 && personAge < 4) {
		// System.out.println("toddler");
		// } else if (personAge >= 4 && personAge < 13) {
		// System.out.println("child");
		// } else if (personAge >= 13 && personAge < 20) {
		// System.out.println("teenager");
		// } else if (personAge >= 20 && personAge < 65) {
		// System.out.println("adult");
		// } else if (personAge >= 65) {
		// System.out.println("pensioner");
		// }

		// int salary = 45000;
		// if (salary > 150000) {
		// System.out.println("45%");
		// } else if (salary > 50000 && salary <= 150000) {
		// System.out.println("40%");
		// } else if (salary > 12500 && salary <= 50000) {
		// System.out.println("20%");
		// } else {
		// System.out.println("0%");
		// }
		//
		//
		// int accountNum = 1000000;
		// if (accountNum >= 10000000 && accountNum <= 99999999){
		// System.out.println("valid account number");
		// } else {
		// System.out.println("invalid account number");
		// }

		// String flightCode = "EZY1234 (Easyjet)";
		// if (flightCode.contains("EZY") ||
		// flightCode.contains("BA") ||
		// flightCode.contains("FR")){
		// System.out.println("valid airline");
		// }else {
		// System.out.println("Invalid airline");
		// }
		//

		// boolean validPassport = false;
		// boolean validDrivingLicense = false;
		// if (validPassport || validDrivingLicense) {
		// System.out.println("ID verified ");
		// } else {
		// System.out.println("not verified");
		// }
		//
		// boolean hasLicense = true;
		// boolean isDead = true;
		// boolean hasPassedEyeTest = true;
		// if (hasLicense && !isDead && hasPassedEyeTest) {
		// System.out.println("can still drive");
		// } else {
		// System.out.println("not licensed to drive");
		// }

//		String[] cityArray = new String[] { "Glasgow", "London", "Birmingham", "Cardiff", "Manchester", "Newcastle" };
//		for (String city : cityArray) {
//			String firstLetterCity = city.substring(0, 1);
//			if (firstLetterCity.equals("B")) {
//				System.out.println(city + ": match");
//				break;
//			} else {
//				System.out.println(city + ": doesn't match");
//			}

//		}
//		String alpha = new String("original");
//		String beta = alpha;
//
//		alpha = alpha +" changed";
//
//		System.out.println("alpha is " + alpha);
//		System.out.println("beta is " + beta);
//
//	}
		StringBuilder alpha = new StringBuilder("original");
		StringBuilder beta = alpha;

		alpha = alpha.append(" changed");

		System.out.println("alpha is " + alpha);
		System.out.println("Beta is " + beta);
	}
	

}
