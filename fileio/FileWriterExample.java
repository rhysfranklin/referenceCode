package com.fdmgroup.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		
		try {
			FileWriter fileWriter = new FileWriter("H:/ade.txt", true); //the true appends the file otherwise it will overwrite it
			
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			bufferedWriter.write("Rhys was here");
			bufferedWriter.newLine();
			
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
