package com.yash.exc6;

import java.util.Scanner;

public class Test2 {

	int max(int[] p) {
		int max = 0;
		for (int i : p) {
			max = i > max ? i : max;
		}
		return max;

	}

	// Generic function to get maximum of n numbers
	public int maxNum() {

		System.out.println("Please enter value of N: ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int largest = Integer.MIN_VALUE;

		System.out.printf("Please enter %d numbers %n", n);
		for (int i = 0; i < n; i++) {

			int current = sc.nextInt();
			if (current > largest) {
				largest = current;
			}
		}
		return largest;
	}
}
