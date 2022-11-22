package com.yash.exc1;

public class Main {

	public static void main(String[] args) {
		Department d = new Department(1, "CS");
		Employee e = new Employee(1, "test", "xyx", "21/01/1996", 200000, "22/10/2022", "pune", d, "1234567890",
				"a@gamil.com");

		System.out.println("Employee : " + e);

		Customer c = new Customer(1, "test", "xyx", "21/01/1996", "22/11/2022", "xyx", "123456789", "a@gmail.com");

		System.out.println("Customer : " + c);
	}
}
