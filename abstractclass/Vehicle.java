package com.fdmgroup.abstractclass;

public abstract class Vehicle {

	private int engineSize;

	public Vehicle(int engineSize) {
		super();
		this.engineSize = engineSize;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
	
    //method for number of wheels
	public abstract int numberOfWheels();

}
