package com.fdmgroup.comparisons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarComparator implements Comparator<CarComparable> {

	public int compare(CarComparable car1, CarComparable car2) {

		if (car1.getEngineSize() > car2.getEngineSize())
			return 1;
		else if (car1.getEngineSize() < car2.getEngineSize())
			return -1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		
		CarComparator carComparator = new CarComparator();
		
		CarComparable firstCar = new CarComparable(999);
		CarComparable secondCar = new CarComparable(1000);

		System.out.println("firstly comparing the two cars");
		
		if (carComparator.compare(firstCar,secondCar) == -1) {
			System.out.println("first car less than second car");
		} else if (carComparator.compare(firstCar,secondCar) == 1) {
			System.out.println("first car greater than second car");
		} else {
			System.out.println("They are equal");
		}
		
		System.out.println("now compare the list of cars and sort them into order");
		
		List<CarComparable> carsList = new ArrayList<CarComparable>();
		carsList.add(new CarComparable(1000));
		carsList.add(new CarComparable(600));
		carsList.add(new CarComparable(500));
		carsList.add(new CarComparable(200));
		carsList.add(new CarComparable(1100));
		
		Collections.sort(carsList, carComparator);

		for (CarComparable eachOne : carsList) {
			System.out.println("This car has an engine size of: "+eachOne.getEngineSize());
		}
	}
}
