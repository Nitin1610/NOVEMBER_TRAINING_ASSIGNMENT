package com.yash.exc1;

public class Person {

	private int pId;
	private String pName;

	private String pAddress;
	private String dob;

	public Person(int pId, String pName, String pAddress, String dob) {
		this.pId = pId;
		this.pName = pName;
		this.pAddress = pAddress;
		this.dob = dob;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "Person{" + "pId=" + pId + ", pName='" + pName + '\'' + ", pAddress='" + pAddress + '\'' + ", dob='"
				+ dob + '\'' + '}';
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getpId() {
		return pId;
	}

	public String getpName() {
		return pName;
	}

	public String getpAddress() {
		return pAddress;
	}

	public String getDob() {
		return dob;
	}
}
