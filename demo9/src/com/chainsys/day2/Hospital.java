package com.chainsys.day2;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
	 String hospitalname;
	 int contact;
	 String doctorname="karthik";
	 String location;
	 Scanner sc=new Scanner(System.in);
	 HospitalAddress a=new HospitalAddress();
	 a.updateToMessage(); 
	 HospitalAddress b=new HospitalAddress();
	 b.addToAddress();
	 System.out.println("Enter the hospitalname:");
	 hospitalname = sc.next();
	 System.out.println("Enter the contact:");
	 contact=sc.nextInt();
	 System.out.println("Enter the location:");
	 location=sc.next();
	 System.out.println("Doctorname:"+doctorname);
	 BHospital c=new BHospital();
	 c.updateToMessage();

	}

}
