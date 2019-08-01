package com.fdmgroup.computer;

public class Processor {
	private double speed;
	private int numberOfCores;
	private String model;

	public Processor() {

	}

	// constructor
	public Processor(double speed, int numberOfCores, String model) {
		super();
		this.speed = speed;
		this.numberOfCores = numberOfCores;
		this.model = model;
	}

	// getters and setters
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getNumberOfCores() {
		return numberOfCores;
	}

	public void setNumberOfCores(int numberOfCores) {
		this.numberOfCores = numberOfCores;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	//method
	public void processData(String data) {
		System.out.println(" ");
	}

}
