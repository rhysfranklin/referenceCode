package com.fdmgroup.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class CollectionsExercises {

	HashSet<String> setOfNames = new HashSet<String>();

	public Set<String> FirstNameSet(String... name) {

		for (String value : name) {
			setOfNames.add(value);
		}
		return setOfNames;

	}
	// question 4 identifying repeat characters in a sentence
	// public HashMap<Character, Integer> LetterOccurences(String word) {
	// String lower = word.toLowerCase();
	// char[] lengthOfWord = lower.toCharArray();
	// HashMap<Character, Integer> numberOfOccurences = new HashMap<Character,
	// Integer>();
	//
	// for (char letter : lengthOfWord) {
	// if (numberOfOccurences.containsKey(letter)) {
	// numberOfOccurences.put(letter, numberOfOccurences.get(letter) + 1);
	//
	// } else {
	// numberOfOccurences.put(letter, 1);
	// }
	// }
	// return numberOfOccurences;
	//
	// }

	// question 5 identifying repeat words in a sentence
	public HashMap<String, Integer> wordOccurences(String sentence) {
		String lowerSentence = sentence.toLowerCase();
		String removePunc = lowerSentence.replaceAll("\\p{Punct}", "");
		String[] wordArray = removePunc.split(" ");
		HashMap<String, Integer> numberOfOccurences = new HashMap<String, Integer>();

		for (String word : wordArray) {

			if (numberOfOccurences.containsKey(word)) {
				numberOfOccurences.put(word, numberOfOccurences.get(word) + 1);

			} else {
				numberOfOccurences.put(word, 1);
			}
		}
		return numberOfOccurences;

	}

	// question 6 taking a linked list and returning a linkedlist object
	// public LinkedList reverseLinkedList(LinkedList reverselist){
	//

}
