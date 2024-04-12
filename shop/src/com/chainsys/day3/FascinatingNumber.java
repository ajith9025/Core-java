package com.chainsys.day3;

import java.util.Scanner;

public class FascinatingNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(Fascinating(num)) 
		{
			System.out.println(num+"is fascinating number");
		}
		else
		{
			System.out.println(num+"is not a fascinating number");
		}
	}

	private static boolean Fascinating(int num) 
	{
		
		return false;
	}

	


	
}


