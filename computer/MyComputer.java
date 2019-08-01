package com.fdmgroup.computer;

import com.fdmgroup.bankaccounts.BankAccount;

public class MyComputer {

	public static void main(String[] args) {

		// instance of the drive 1
		HardDrive drive1 = new HardDrive(2048, 0, "Seagate");
		double bytesCapacity = drive1.getGigaBytesCapacity();
		double bytesUsed = drive1.getGigaBytesUsed();
		String myModel = drive1.getModel();
		System.out.println("you have model: " + myModel);
		System.out.println("you have used: " + bytesUsed + " bytes");
		System.out.println("you have capacity of: " + bytesCapacity);

		// instance of the drive 2
		HardDrive drive2 = new HardDrive(3072, 500, "Dell");
		double bytesCapacity2 = drive2.getGigaBytesCapacity();
		double bytesUsed2 = drive2.getGigaBytesUsed();
		String myModel2 = drive2.getModel();

		// instance of processor 1
		Processor processor1 = new Processor(2.93, 6, "Intel Xeon");
		double speed = processor1.getSpeed();
		double cores = processor1.getNumberOfCores();
		String model = processor1.getModel();

		// instance of processor 2
		Processor processor2 = new Processor(2.93, 6, "Intel Xeon");
		double speed2 = processor2.getSpeed();
		double cores2 = processor2.getNumberOfCores();
		String model2 = processor2.getModel();

		// instance of memory 1
		Memory memory1 = new Memory(4, 1600, "Intel Xeon");
		String memoryModel = memory1.getModel();
		double memoryCapacity = memory1.getGigaBytesCapacity();
		double memorySpeed = memory1.getSpeed();

		// instance of memory 2
		Memory memory2 = new Memory(4, 1600, "Intel Xeon");
		String memoryModel2 = memory2.getModel();
		double memoryCapacity2 = memory2.getGigaBytesCapacity();
		double memorySpeed2 = memory2.getSpeed();

		//creating objects 1.2
		Computer computer1 = new Computer("Dell", processor1, drive1, memory1, 399);
		Processor processor = computer1.getPROCESSOR();
		String computerModel = computer1.getModel();
		HardDrive computerHardDrive = computer1.getHardDrive();
		Memory computerMemory = computer1.getMemory();
		double computerPrice = computer1.getPrice();
        
		//accessing previous drives, processors as if they were in seperate classes
		System.out.println(processor.getModel());
		System.out.println(computerHardDrive.getGigaBytesCapacity());
		System.out.println(computerMemory.getGigaBytesCapacity());
		
		//creating objects 1.2
		Computer computer2 = new Computer("HP", processor2, drive2, memory2, 299);
		Processor computerProcessor = computer2.getPROCESSOR();
		String computerModel2 = computer2.getModel();
		HardDrive computerHardDrive2 = computer2.getHardDrive();
		Memory computerMemory2 = computer2.getMemory();
		double computerPrice2 = computer2.getPrice();
		
		System.out.println(computerProcessor.getModel());
		System.out.println(computerHardDrive2.getGigaBytesCapacity());
		System.out.println(computerMemory2.getGigaBytesCapacity());
		
	}

}
