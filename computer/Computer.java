package com.fdmgroup.computer;

public class Computer {
	private String MODEL;
	private Processor PROCESSOR;
	private HardDrive hardDrive;
	private Memory memory;
	private double price;
	
	public Computer(){
		
	}
	
    //constructor
	public Computer(String mODEL, Processor pROCESSOR, HardDrive hardDrive, Memory memory, double price) {
		super();
		MODEL = mODEL;
		PROCESSOR = pROCESSOR;
		this.hardDrive = hardDrive;
		this.memory = memory;
		this.price = price;
	}
	
	//getters and setters
	public String getModel() {
		return MODEL;
	}
	public void setModel(String model) {
		this.MODEL = model;
	}
	public Processor getPROCESSOR() {
		return PROCESSOR;
	}
	public void setPROCESSOR(Processor pROCESSOR) {
		PROCESSOR = pROCESSOR;
	}
	public HardDrive getHardDrive() {
		return hardDrive;
	}
	public void setHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
	}
	public Memory getMemory() {
		return memory;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
