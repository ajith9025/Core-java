package com.chainsys.oops;

public class EmployeeDetailsTest {

	public static void main(String[] args) {
		EmployeeDetails employee = new EmployeeDetails();
		employee.setEmpId(245);
		employee.setEmpName("Ajith");
		employee.setEmpSalary(20000);
		employee.setLocation("Madurai");
		employee.setRole("java developer");
		System.out.println("Employee empid:" + employee.getEmpId());
		System.out.println("Employee empname:" + employee.getEmpName());
		System.out.println("Employee empsalary:" + employee.getEmpSalary());
		System.out.println("Employee locatoion:" + employee.getLocation());
		System.out.println("Employee role:" + employee.getRole());

	}

}
