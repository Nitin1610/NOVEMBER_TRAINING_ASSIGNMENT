package com.yash.exc8;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) throws PasswordFormatException {

		int min = 8;
		int max = 14;
		int digit = 0;
		int special = 0;
		int upCount = 0;
		int loCount = 0;
		String password;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter Your Password:");
		password = scan.nextLine();
		if (password.length() >= min && password.length() <= max) {
			for (int i = 0; i < password.length(); i++) {
				char c = password.charAt(i);
				if (Character.isUpperCase(c)) {
					upCount++;
				}
				if (Character.isLowerCase(c)) {
					loCount++;
				}
				if (Character.isDigit(c)) {
					digit++;
				}
				if (c >= 33 && c <= 46 || c == 64) {
					special++;
				}
			}
			if (special == 2 && loCount == 2 && upCount == 2 && digit == 2) {
				System.out.println(" Password is Strong:");
			}

		}

		if (password.length() < min) {

			for (int i = 0; i < password.length(); i++) {
				char c = password.charAt(i);
				if (Character.isLowerCase(c)) {
					loCount++;
				}
			}

			if (loCount > 0) {

				throw new PasswordFormatException(
						" Password must be atleat " + min + " characters:" + "You need atleast one upper case chracter:"
								+ " You need atleast one digit:" + " You need atleast one special chracter:");

			}
		} else if (password.length() < min && upCount == 2) {
			for (int i = 0; i < password.length(); i++) {
				char c = password.charAt(i);
				if (Character.isLowerCase(c)) {
					loCount++;
				}
				if (Character.isUpperCase(c)) {
					upCount++;
				}
			}
			if (loCount > 0 && upCount > 0) {

				throw new PasswordFormatException(" Password must be atleat " + min + " characters:"
						+ " You need atleast one digit:" + " You need atleast one special chracter:");

			}
		}
		if (password.length() > max || password.length() == max && upCount == 2 && loCount == 2 && digit == 2) {

			throw new PasswordFormatException(
					" Password must be atleat " + min + " characters:" + " You need atleast one special chracter:");
		}
		if (password.length() >= min && password.length() <= max && loCount == 2 && upCount == 2 && digit == 2
				&& special == 2) {
			throw new PasswordFormatException(" You need atleast a special chracter");
		}
		if (password.length() >= min && password.length() <= max && loCount == 2 && upCount == 2 && digit == 2
				&& special == 2) {

			throw new PasswordFormatException(
					" You need atleast one digit:" + " You need atleast one special chracter:");
		}
	}
}
