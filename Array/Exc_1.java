package com.yash.arraysDemo;

import java.util.stream.Stream;

public class Exc_1 {
	public static void main(String[] args) {
		Integer maxNum = Stream.of(20,2,40).
				reduce(0, Integer::max);
		System.out.println(maxNum);
	}

}
