package com.yash.arraysDemo;

import java.util.Arrays;
import java.util.Comparator;

public class Exc_10 {

	public static void main(String[] args) {
		
		String input = "My name is Nitin";
		String[] arr = Arrays.stream(input.split(" "))
		                     .sorted(Comparator.comparingInt(String::length))
		                     .toArray(String[]::new);
		
		System.out.println(Arrays.toString(arr));
	}

}
