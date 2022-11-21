package com.yash.arraysDemo;

import java.util.Optional;

public class Exc_11 {
	public static void main(String[] args) {
		String str[] = { "nitin", "ravi", "sanket", "akshay", "aba", "noon" };
		int count = 0;
		String str1[] = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			String reverse = "";
			for (int j = str[i].length() - 1; j >= 0; j--)
				reverse = reverse + str[i].charAt(j);

			if (str[i].equals(reverse)) {
				str1[i] = reverse;
				count++;
			}

		}
		str = new String[count];
		int count1 = 0;
		for (int i = 0; i < str1.length; i++) {
			Optional<String> checkNull = Optional.ofNullable(str1[i]);
			if (checkNull.isPresent() == true) {
				str[count1] = str1[i];
				System.out.println(str[count1]);
				count1++;
			}
		}
	}

}
