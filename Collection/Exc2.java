package com.yash.collectionDemo;

import java.util.Arrays;

public class Exc2 {

	public static void main(String args[]) {

		int intArray[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println("The input Array : " + Arrays.toString(intArray));

		int key = 50;
		System.out.println("\nThe key to be searched:" + key);

		int result = Arrays.binarySearch(intArray, key);

		if (result < 0)
			System.out.println("\nKey is not found in the array!");
		else
			System.out.println("\nKey is found at index: " + result + " in the array.");
	}
}
