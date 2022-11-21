package com.yash.arraysDemo;

public class Exc_5 {

	public static void main(String[] args) {
		{
			int arr[] = { 2, 3, 7, 6, 8, 11, 17, 28 };
			int sum = 0;
			System.out.println("Even Numbers:-");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					System.out.println(arr[i]);
				}
			}

			System.out.println("odd Numbers:-");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 != 0) {
					System.out.println(arr[i]);
				}
			}

			System.out.println("perfect Numbers:-");

			for (int i = 0; i < arr.length; i++) {
				sum = 0;
				for (int j = 1; j <= arr[i] / 2; j++) {
					if (arr[i] % j == 0) {
						sum = sum + j;
					}
				}

				if (sum == arr[i]) {
					System.out.println(sum);
				}
			}

			System.out.println("prime Numbers:-");
			for (int i = 0; i < arr.length; i++) {
				int flag = 0;
				for (int j = 2; j <= arr[i] / 2; j++) {
					if (arr[i] % j == 0) {
						flag = 1;
						break;
					}
				}
				if (flag == 0)
					System.out.println(arr[i]);

			}
		}

	}
}
