package com.fdmgroup.fileio;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FileExercises {

	public void fileCharacterCounter(String filename, char character) {

		int counter = 0;
		try {

			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			int lineOfText = 0;

			while ((lineOfText = bufferedReader.read()) != -1) {
				if (lineOfText == character) {
					counter += 1;
				}
			}
			bufferedReader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(counter);

	}

	public void registerUser() {
		System.out.println("Please enter your name");
		Scanner nameScan = new Scanner(System.in);
		String nameScanner = nameScan.nextLine();

		System.out.println("Please enter your email");
		Scanner emailScan = new Scanner(System.in);
		String emailScanner = emailScan.nextLine();

		System.out.println("Please enter your address");
		Scanner adressScan = new Scanner(System.in);
		String addressScanner = emailScan.nextLine();

		try {
			FileWriter fileWriter = new FileWriter("H:/users.txt", true); // the
																			// true
																			// appends
																			// the
																			// file
																			// otherwise
																			// it
																			// will
																			// overwrite
																			// it
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write(nameScanner + ", " + emailScanner + ", " + addressScanner);
			bufferedWriter.newLine();
			bufferedWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readUser() {
		HashMap<Integer, User> users = new HashMap<Integer, User>();
		try {
			FileReader fileReader = new FileReader("H:/users.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String lineOfText = "";
			int counter = 0;
			
			while( (lineOfText = bufferedReader.readLine() ) != null){
				String userDetails = lineOfText;
				String[] userSplit = userDetails.split(",");
				
				String name = userSplit[0];
				String email = userSplit[1];
				String address = userSplit[2];
		
				
				User user = new User(name, email, address);
				users.put(counter, user);
				counter =+ 1;
			}
		

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(users);
	}

	public static void main(String[] args) {
		FileExercises charCounter = new FileExercises();
		charCounter.fileCharacterCounter("H:/ade.txt", 'R');
		charCounter.readUser();
		

	}

}
