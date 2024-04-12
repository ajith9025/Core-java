package com.chainsys.day3;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) 
	{
		double salary;
		int yearofService;
		double bonus;
		double netAmount;
		double OriginalSalary=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Salary");
	    salary=sc.nextInt();
	    System.out.println("Year of experience");
	    yearofService=sc.nextInt();
	    if(salary>0 && yearofService>5&&yearofService!=0) 
	    {
	    	OriginalSalary = salary;
	    	bonus=OriginalSalary*0.65;
	    	System.out.println("bonus:"+bonus);
	    	netAmount=salary+ bonus;
	    	System.out.println("net amount after received");  	
	    }
	    else
	    {
	    	System.out.println("Better the luck Man");
	    }
	}

}
