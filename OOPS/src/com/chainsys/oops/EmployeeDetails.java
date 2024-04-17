package com.chainsys.oops;

public class EmployeeDetails {
	int empId;
	int empSalary;
	String empName;
	String location;
	String role;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		int EmpId = empId;
		if (empId > 100 && empId < 300) {
			this.empId = empId;
		} else
			System.out.println("Invalid Number");
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		String EmpName = empName;
		if (empName.matches("^[a-zA-Z]+$")) {
			this.empName = empName;
		} else
			System.out.println("Invalid Name");
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		String Location = location;
		if (location.matches("^[a-zA-Z]+$")) {
			this.location = location;
		} else
			System.out.println("Invalid");
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		String Role = role;
		if (role.matches("^[a-zA-Z]+$")) {
			this.role = role;
		} else
			System.out.println("Invalid");

	}

	public EmployeeDetails(int empId, int empSalary, String empName, String location, String role) {

		this.empId = empId;
		this.empSalary = empSalary;
		this.empName = empName;
		this.location = location;
		this.role = role;
	}

	public EmployeeDetails() {
	}

	@Override
	public String toString() {
		return "EmployeeDetails [empId=" + empId + ", empSalary=" + empSalary + ", empName=" + empName + ", location="
				+ location + ", role=" + role + "]";
	}
}
