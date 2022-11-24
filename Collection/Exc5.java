package com.yash.collectionDemo;

import java.util.Collections;
import java.util.Vector;

public class Exc5 {
	public static void main(String[] args) {
		Vector<String> items = new Vector();
		items.add("pen");
		items.add("pencil");
		items.add("rubber");
		items.add("book");

		System.out.println("ArrayList with duplicate elements: " + items);

		Collections.sort(items);
		System.out.println("ArrayList without duplicate elements: " + items);
	}
}
