package com.yash.exc12;

public class TestDate {

	private int year, month, dayOfMonth;

	public TestDate(int yearArg, int monthArg, int dayOfMonthArg) {
		this.year = yearArg;
		this.month = monthArg;
		this.dayOfMonth = dayOfMonthArg;
	}

	@Override
	public String toString() {
		String s = this.year + "-" + String.format("%02d", this.month) + "-" + String.format("%02d", this.dayOfMonth);
		return s;
	}
}
