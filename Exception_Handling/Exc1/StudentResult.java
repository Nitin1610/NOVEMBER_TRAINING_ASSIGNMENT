package com.yash.exc1;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) throws ResultException {

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Enter the total subjects ");
		n = sc.nextInt();
		int temp = 0;
		int arr[] = new int[n];
		//int array[]= new int[n];
		System.out.println("Enter the marks secured in each subject ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] < 0) {
				throw new ResultException("don't put negative mark");
			}
			
		}
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] < 34) 
					temp ++;
					if (temp > 1) {
						throw new ResultException("fail more than one subject");

					}
				
			}
		

		int total = 0;

		for (int j = 0; j < n; j++) {
			total = total + arr[j];
		}
		System.out.println("The total marks obtained is " + total);

		float percentage;
		percentage = (total / (float) n);
		System.out.println("Total Percentage : " + percentage + "%");
		if (percentage < 40) {
			throw new ResultException("fail");
		}

	}
}
