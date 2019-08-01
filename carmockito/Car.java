package com.fdmgroup.carmockito;

public class Car {
	
    private Wheel wheel;
	
	public void drive() {
		wheel.spin();
		
		
	}

	public void setWheel(Wheel wheel) {
		this.wheel=wheel;
		
		
	}

	public void accelerate(int amount, String DriverName) {
		wheel.spin();
		wheel.spin(amount);
		wheel.spin(DriverName);
		wheel.spin(amount, DriverName);
		
	}

}
