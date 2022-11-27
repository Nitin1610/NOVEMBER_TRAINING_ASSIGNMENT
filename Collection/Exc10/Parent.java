package com.yash.exc10;

public class Parent {

	static int[] a = new int[] { 22, 3, 550, 4, 11, 100 };
	static int max = a[0];

	public void Cal_Max() throws NullPointerException, ArrayIndexOutOfBoundsException {
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("The Given Array is:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("The Largest Number is:" + max);
	}
}
