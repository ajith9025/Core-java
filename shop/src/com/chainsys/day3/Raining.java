package com.chainsys.day3;

import java.util.Scanner;

public class Raining
{
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Is it raining?(Yes/No):");
		String raining=sc.next();
		System.out.println("what is the temperature in degrees Fahrenheit?:");
		int temperature=sc.nextInt();
		if(raining.equalsIgnoreCase("yes"))
		{
			System.out.println("Get an Umbralla!");
		}
		if(temperature<32) {
			
			System.out.println("Bring a heavy jacket");
		}
		else if(temperature>=32&&temperature<=50) 
		{
			System.out.println("Bring a light jacket");
		}
		else
		{
			System.out.println("No jacket needed");
		}
		sc.close();
	}
}


