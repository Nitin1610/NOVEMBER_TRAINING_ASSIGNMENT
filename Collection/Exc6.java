package com.yash.collectionDemo;

import java.util.HashMap;

public class Exc6 {

	public static void main(String[] args) {

	    HashMap<String, Integer> people = new HashMap<String, Integer>();

	    people.put("India", 10000);
	    people.put("USA", 3000);
	    people.put("Canada",2500);

	    for (String i : people.keySet()) {
	      System.out.println("Name: " + i + " Age: " + people.get(i));
	    }
	  }
}
