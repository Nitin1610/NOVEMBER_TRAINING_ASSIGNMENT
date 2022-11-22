package com.yash.exc12;

public class Employee {

	private int emp_id;
	private String ename;
	private int emp_salary;
	private String eaddress;
	private TestDate emp_dob , emp_doj ;
	
	public Employee(int emp_id, String ename, int emp_salary, String eaddress, TestDate emp_dob, TestDate emp_doj) {
		super();
		this.emp_id = emp_id;
		this.ename = ename;
		this.emp_salary = emp_salary;
		this.eaddress = eaddress;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}
	
	public Employee( int emp_id, String ename, int emp_salary, String eaddress, int birthYearArg , int birthMonthArg , int birthDayOfMonthArg , int hireYearArg , int hireMonthArg , int hireDayOfMonthArg  ) {
		this.emp_id = emp_id;
		this.ename = ename;
		this.emp_salary = emp_salary;
		this.eaddress = eaddress;
		this.emp_dob = new TestDate( birthYearArg , birthMonthArg , birthDayOfMonthArg );
		this.emp_doj = new TestDate( hireYearArg , hireMonthArg , hireDayOfMonthArg );
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", ename=" + ename + ", emp_salary=" + emp_salary + ", eaddress="
				+ eaddress + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}

	public static void main(String[] args) {
		
		TestDate emp_dob = new TestDate( 1967 , 1 , 23 );
		TestDate emp_doj = new TestDate( 2016 , 2 , 28 );
		Employee e1 = new Employee( 1 , "Nitin",23000 ,"pune", emp_dob , emp_doj );
		System.out.println( e1 );
 
		Employee e2 = new Employee( 2,"Xyz" , 35000 ,"Mumbai", 1968 , 2 , 24 , 2016 , 4 , 14 );
		System.out.println( e2 );
 
	}
	
	
}
