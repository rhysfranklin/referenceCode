package com.fdmgroup.collections;

import java.awt.Color;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapColours {
	public static void main(String[] args) {
	
	HashMapColours chooseColour = new HashMapColours();
	HashMap<String, Color> mapColour = new HashMap<String, Color>();
	
	mapColour = chooseColour.ReturnColors();
	Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    if (mapColour.containsKey(line))
           System.out.println(mapColour.get(line));

	}
	public HashMap<String, Color> ReturnColors(){
		HashMap<String, Color> mapColour = new HashMap<String, Color>();
		mapColour.put("red", Color.red);
		mapColour.put("blue", Color.blue);
		mapColour.put("green", Color.green);
		mapColour.put("black", Color.black);
		return mapColour;
	}
}
