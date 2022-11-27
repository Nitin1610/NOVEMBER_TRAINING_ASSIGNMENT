package com.yash.exc10;

public class Child extends Parent {

	public void Cal_Max() throws NumberFormatException, NullPointerException {

		int average = Parent.max / a.length;

		System.out.format("The average is:"+average);
	}

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.Cal_Max();
		Child child = new Child();
		child.Cal_Max();
	}
}
