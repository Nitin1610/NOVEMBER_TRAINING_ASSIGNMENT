package com.yash.exc5;

public abstract class Sum extends CalcAbs {
	@Override
	void sum(int a, int b) {

		int sum = a + b;
		System.out.println("Sum : " + sum);

	}

}
