package com.fdmgroup.comparisons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarComparable implements Comparable<CarComparable> {

	private int engineSize;

	public CarComparable(int engineSize) {
		this.engineSize = engineSize;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public int compareTo(CarComparable outsideCar) {
		if (this.engineSize < outsideCar.getEngineSize())
			return -1;
		else if (this.engineSize > outsideCar.getEngineSize())
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {

		CarComparable firstCar = new CarComparable(999);
		CarComparable secondCar = new CarComparable(1000);

		if (firstCar.compareTo(secondCar) == -1) {
			System.out.println("first car less than second car");
		} else if (firstCar.compareTo(secondCar) == 1) {
			System.out.println("first car greater than second car");
		} else {
			System.out.println("They are equal");
		}

		List<CarComparable> carsList = new ArrayList<CarComparable>();
		carsList.add(new CarComparable(1000));
		carsList.add(new CarComparable(600));

		Collections.sort(carsList);

		for (CarComparable car : carsList) {
			System.out.println(car.getEngineSize());
		}
	}

}

