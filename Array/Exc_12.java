package com.yash.arraysDemo;

import java.util.Arrays;

public class Exc_12 {

	public static void main(String args[]) {

		int[] arr = { 10, 2, 3, 41, 12, 13, 19, 81, 9 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] % 10 > arr[j] % 10) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		Arrays.stream(arr).forEach(n -> System.out.println(n));
	}
}
