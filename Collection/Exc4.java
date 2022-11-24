package com.yash.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Exc4 {

	public static void main(String[] args) {

		List<String> items = new ArrayList<>(Arrays.asList("pen","bottle","pencil ","rubber","pen"));
		System.out.println("ArrayList with duplicate elements: " + items);

		Set<String> set = new LinkedHashSet<>();
		set.addAll(items);

		items.clear();

		items.addAll(set);
		Collections.sort(items,Collections.reverseOrder());
		System.out.println("ArrayList without duplicate elements: " + items);
	}
}
