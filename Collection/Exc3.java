package com.yash.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Exc3 {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 1, 3, 4, 1, 3));
		System.out.println("ArrayList with duplicate elements: " + numbers);

		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(numbers);

		numbers.clear();

		numbers.addAll(set);
		Collections.sort(numbers);
		System.out.println("ArrayList without duplicate elements: " + numbers);
	}
}
