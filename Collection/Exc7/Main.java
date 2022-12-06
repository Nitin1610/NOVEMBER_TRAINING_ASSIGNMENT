package com.yash.collectionDemo.exc7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		List<Student> studentList = Arrays.asList(new Student(1, "Nitin", 80), 
												  new Student(2, "Sandeep", 45),
												  new Student(3, "Sushant", 40), 
												  new Student(4, "Advik", 75));
		List<Double> collect2 = studentList.stream().map(Student::getAvg).collect(Collectors.toList());
		List<Double> firstThreeNumbers = collect2.stream().sorted().collect(Collectors.toList());
		firstThreeNumbers.forEach(System.out::println);
		List<Student> nameBelowFiftyMarks = studentList.stream().filter(s -> s.getAvg() < 50)
				.collect(Collectors.toList());
		nameBelowFiftyMarks.forEach(System.out::println);
		List<Student> nameBelowThirtyfive = studentList.stream().filter(s -> s.getAvg() < 35)
				.collect(Collectors.toList());
		nameBelowThirtyfive.forEach(System.out::println);
		List<String> byName = studentList.stream().map(Student::getSname).collect(Collectors.toList());
		byName.forEach(System.out::println);

	}
}
