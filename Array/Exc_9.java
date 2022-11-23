package com.yash.arraysDemo;

import java.util.Scanner;

public class Exc_9 {
	public static void main(String[] args) {
		int row, col;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total Number of ROW :");
		row = sc.nextInt();
		System.out.println("Enter the total Number of COL :");
		col = sc.nextInt();

		int inputArray[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter element for array[" + (i + 1) + "," + (j + 1) + "] : ");
				inputArray[i][j] = sc.nextInt();
			}
		}
		System.out.println("You have entered : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(inputArray[i][j] + "\t");
			}
			System.out.println();
		}

		// 7
		System.out.println("The boundary elements of this matrix are : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
					System.out.print(inputArray[i][j] + "\t");
				} else {
					System.out.print("\t");
				}

			}
			System.out.println();
		}
	}
}
