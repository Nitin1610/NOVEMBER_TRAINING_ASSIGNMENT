package com.yash.arraysDemo;

import java.util.Scanner;

public class Exc_4 {

	public static void main(String[] args) {

		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :: ");
		number = scanner.nextInt();
		if (number > 0) {
			for (int a = 1; a <= number - 2; a++) {
				for (int b = a + 1; b <= number - 1; b++) {
					for (int c = b + 1; c <= number; c++) {
						if (a * a + b * b == c * c) {
							System.out.println(a + " " + b + " " + c + " ");
						}
					}
				}
			}
		}

	}

}
