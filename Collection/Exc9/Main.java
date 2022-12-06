package com.yash.collectionDemo.exc9;

import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
	
	public static void main(String[] args) {
		CopyOnWriteArrayList<Employee> empList = new CopyOnWriteArrayList<>();
		Employee employee1 = new Employee(101, "Nitin", 1000, "dev", "Nagpur");
		Employee employee2 = new Employee(102, "Sandeep",  2000, "dev", "Solapur");
		Employee employee3 = new Employee(103, "Sushant",   4000, "dev", "Mumbai");
		Employee employee4 = new Employee(104, "Advik",   3000, "dev", "Pune");
		
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		empList.add(employee4);
		for (Employee employee : empList) {
			int objectElement = employee.getEid();
			int index = objectElement % 10;
			empList.add(index, employee);
		}
		empList.forEach(System.out::println);
	}
}
