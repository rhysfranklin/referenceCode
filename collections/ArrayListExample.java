package com.fdmgroup.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//array lists for integers
		ArrayList<Integer> listIntegers = new ArrayList<Integer>();
		
		listIntegers.add(1);
		
		//array lists for strings
		ArrayList<String> listStrings = new ArrayList<String>();
		
		listStrings.add("add");
		listStrings.add("to");
		listStrings.add("string");
		
		String newitem = listStrings.get(2);
		System.out.println(newitem);
		boolean exists = listStrings.contains("add");
		System.out.println(exists);
		int position = listStrings.indexOf("string");
		System.out.println(position);
		
				
		
		//array list for characters
		ArrayList<Character> listchars = new ArrayList<Character>();
		
		listchars.add('e');
		listchars.add('d');
		listchars.add('g');
		
		//assigning a variable with a wrapper
		Character character = listchars.get(1);
		
		System.out.println(character);
		System.out.println(listchars.get(0));
		
		//removing from the array list
		listchars.remove(0);
		System.out.println(listchars.get(0));
		
		
		

	}

}
