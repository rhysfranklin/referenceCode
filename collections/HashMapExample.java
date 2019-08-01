package com.fdmgroup.collections;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;



public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, String> hashMapDetails = new HashMap<String, String>();
		
		hashMapDetails.put("Rhys@fdmgroup.com", "Rhys Franklin");
		hashMapDetails.put("Rhys@fdmgroup.com", "Rhys David Franklin");
		
		hashMapDetails.put("jim@fdmgroup.com", "Jim");
		
		System.out.println(hashMapDetails);
		
		boolean exists = hashMapDetails.containsKey("Rhys@fdmgroup.com");
		if (exists){
			System.out.println("key already exists");
			String value = hashMapDetails.get("Rhys@fdmgroup.com");
			System.out.println(value);
		}
		Set<Entry<String, String>> allEntries = hashMapDetails.entrySet();
		
		for( Entry<String, String> eachEntry: allEntries){
			String key = eachEntry.getKey();
			String value = eachEntry.getValue();
			
			System.out.println("key: "+ key + "value: "+ value);
			
		}
		
		
		Collection<String> allValues = hashMapDetails.values();
		
		for(String eachValue: allValues){
			System.out.println(eachValue);
		}
		
		Set<String> allKeys = hashMapDetails.keySet();
		
		for(String eachKey: allKeys){
			System.out.println(eachKey);
		}

	}

}
