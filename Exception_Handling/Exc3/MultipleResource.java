package com.yash.exc3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class MultipleResource {

	public static void main(String[] args) {

		try (BufferedReader bufferedReader = new BufferedReader(
				new FileReader("text.txt"));
				PrintWriter printWriter = new PrintWriter("new.txt")) {

			String line = bufferedReader.readLine();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
