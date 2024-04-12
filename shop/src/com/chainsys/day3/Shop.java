package com.chainsys.day3;

import java.util.Scanner;

public class Shop
{
            public static int discountCalculator(int n)
		    {
		        n=n-(n/10);
		        return n;
		    }
		    public static void main(String[] args) 
		    {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the Unit you have purchased");
		        int n=sc.nextInt();
		        if(n>0) 
		        {
		            if(n>=10)
		            {
		                System.out.println("you got offer");
		                System.out.println("Pay "+discountCalculator(n*100)+" Only");
		            }
		            else
		            {
		                System.out.println("Thank you for purchasing");
		            }
		        }
		        else 
		        {
		            System.out.println("Enter positive number");
		        }
		    }
}
	


