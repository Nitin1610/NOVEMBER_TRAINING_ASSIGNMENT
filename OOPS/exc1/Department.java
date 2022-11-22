package com.yash.exc1;

public class Department {

	private int deptId;
	private String dName;

	@Override
	public String toString() {
		return "Department{" + "deptId=" + deptId + ", dName='" + dName + '\'' + '}';
	}

	public Department(int deptId, String dName) {
		this.deptId = deptId;
		this.dName = dName;
	}

	public int getDeptId() {
		return deptId;
	}

	public String getdName() {
		return dName;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}
}
