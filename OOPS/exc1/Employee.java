package com.yash.exc1;

public class Employee extends Person {

	private double salary;
	private String date_of_joining;
	private String base_location;

	@Override
	public String toString() {

		return super.toString() + "Employee{" + "salary=" + salary + ", date_of_joining='" + date_of_joining + '\''
				+ ", base_location='" + base_location + '\'' + ", deptobj=" + deptobj + ", contactno='" + contactno
				+ '\'' + ", emailid='" + emailid + '\'' + '}';
	}

	private Department deptobj;
	private String contactno;
	private String emailid;

	public Employee(int pId, String pName, String pAddress, String dob, double salary, String date_of_joining,
			String base_location, Department deptobj, String contactno, String emailid) {
		super(pId, pName, pAddress, dob);
		this.salary = salary;
		this.date_of_joining = date_of_joining;
		this.base_location = base_location;
		this.deptobj = deptobj;
		this.contactno = contactno;
		this.emailid = emailid;
	}

	public double getSalary() {
		return salary;
	}

	public String getDate_of_joining() {
		return date_of_joining;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}

	public void setDeptobj(Department deptobj) {
		this.deptobj = deptobj;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getBase_location() {
		return base_location;
	}

	public Department getDeptobj() {
		return deptobj;
	}

	public String getContactno() {
		return contactno;
	}

	public String getEmailid() {
		return emailid;
	}
}
