package com.yash.exc7;

import java.util.Scanner;

public class Exc_7 extends Test{

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter String1 :");
		String string1 = sc1.nextLine();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter" + " String 2 :");
		String string2 = sc2.nextLine();

		Test test = new Test();
		int compare = test.stringCompare(string1, string2);
		if (compare == 0) {
			System.out.printf("Entered Strings %s and %s are equal", string1, string2);
		} else if (compare > 0 | compare < 0) {
			System.out.printf("Entered Strings %s and %s are not equal", string1, string2);
		}
	}
}
