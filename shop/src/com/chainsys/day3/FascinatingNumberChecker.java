package com.chainsys.day3;

import java.util.Scanner;

public class FascinatingNumberChecker
{
		    public static void main(String[] args) 
		    {
		        Scanner sc=new Scanner(System.in);
		        System.out.print("Enter any Number: ");
		        int num=sc.nextInt(); 
		        if (num<100)
		        {
		            System.out.println(num+ "is not a Fascinating Number");
		            return;
		        }
		        int num2=num*2;
		        int num3=num*3;
		        String concatStr=num+ "" +num2+num3;
		        for (char digit='1';digit<='9';digit++) 
		        {
		            int count=0;
		            for (int i=0;i<concatStr.length();i++) 
		            {
		                char ch=concatStr.charAt(i);
		                if (ch==digit)
		                {
		                    count++;
		                }
		            }
		            if (count>1||count==0)
		            {
		                System.out.println(num + " is not a Fascinating Number");
		                return;
		            }
		        }
		         System.out.println(num + " is a Fascinating Number");
		    }
}


