package com.fdmgroup.computer;

public class Memory {
	private double gigaBytesCapacity;
	private double speed;
	private String model;

	public Memory(){
		
	}
	//constructor
	public Memory(double gigaBytesCapacity, double speed, String model) {
		super();
		this.gigaBytesCapacity = gigaBytesCapacity;
		this.speed = speed;
		this.model = model;
	}

	//getters and setters
	public double getGigaBytesCapacity() {
		return gigaBytesCapacity;
	}

	public void setGigaBytesCapacity(double gigaBytesCapacity) {
		this.gigaBytesCapacity = gigaBytesCapacity;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	//method for storing data
	public void storeData(String data) {
		System.out.println(" ");
	}

}
