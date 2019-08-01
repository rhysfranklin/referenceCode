package com.fdmgroup.computer;

public class HardDrive {
	private double gigaBytesCapacity;
	private double gigaBytesUsed;
	private String model;

	public HardDrive(){
		
	}
	
	// constructor
	public HardDrive(double gigaBytesCapacity, double gigaBytesUsed, String model) {
		super();
		this.gigaBytesCapacity = gigaBytesCapacity;
		this.gigaBytesUsed = gigaBytesUsed;
		this.model = model;
	}

	// start of getter and setters
	public double getGigaBytesCapacity() {
		return gigaBytesCapacity;
	}

	public void setGigaBytesCapacity(double gigaBytesCapacity) {
		this.gigaBytesCapacity = gigaBytesCapacity;
	}

	public double getGigaBytesUsed() {
		return gigaBytesUsed;
	}

	public void setGigaBytesUsed(double gigaBytesUsed) {
		this.gigaBytesUsed = gigaBytesUsed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void writeData(String data, String file) {
		System.out.println(" ");
	}

	public String readData(String file) {
		System.out.println(" ");
		return file;

	}

}
