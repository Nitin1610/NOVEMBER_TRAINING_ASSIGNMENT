package com.yash.exc6;

public class Test1 extends Test2 {

	public static void main(String[] args) {
		int[] arr = { 22, 8, 1, 71 };
		Test2 test = new Test2();
		System.out.println(test.max(arr));

		// output of generic function
		System.out.println("Largest Number is :" + test.maxNum());

	}
}
