package com.fdmgroup.collections;

import java.util.Set;

public class Runner {

	public static void main(String[] args) {
//		CollectionsExercises setOfNames = new CollectionsExercises();
//		Set<String> uniqueNames = setOfNames.FirstNameSet("Rhys", "David", "Rhys");
//		System.out.println(uniqueNames);
		
		CollectionsExercises numbersOfLetters = new CollectionsExercises();
		System.out.println(numbersOfLetters.wordOccurences("hello world hello world, hello"));
		

	}

}
