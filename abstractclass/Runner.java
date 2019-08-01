package com.fdmgroup.abstractclass;

public class Runner {

	public static void main(String[] args) {
		
		Car car = new Car(100, 1000);
		System.out.println(car.getEngineSize());
		System.out.println(car.numberOfWheels());
		System.out.println(car.getMpg());
		
	

	}

}
