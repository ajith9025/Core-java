package com.chainsys.day3;

import java.util.Scanner;

public class Emoloyee 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		System.out.println("Enter the sex(M or F):");
		String sex=sc.next();
		System.out.println("Enter the maritalStatus(Y or N):");
		String maritalStatus=sc.next();
		if(sex=="F")
		{
			System.out.println("Place of service:urban areas");
		}
		else if(sex=="M")
		{
			if(age>=20&&age<=40)
			{
				System.out.println("Place of service:Anywhere");
			}
			else if(age>=40&&age<=60)
			{
				System.out.println("Place of service:urban areas");
			}
			else
			{
				System.out.println("ERROR");
			}
		}
		else
		{
			System.out.println("ERROR");
		}
	}
}
		
		



