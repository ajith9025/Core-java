package com.chainsys.day3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Attendance 
{
		static int totalClassHeld=180;
	    public static void attendExamOrNot(int classAttended) 
	    {
	    Scanner sc=new Scanner(System.in);
	    double percentage=classAttended*100/totalClassHeld ;
	    if(percentage<75) 
	    {
	            System.out.println("Your Attendance percentage is "+percentage+" you are not "+ "eligiable to written exam");
	            System.out.println("If you have Medical cause type Y or else N");
	            char n=sc.next().toLowerCase().charAt(0);
	            if(n=='y') 
	            {
	                System.out.println("Submit your Medical Certificate to mentor then write Exam");
	            }
	            else
	            {
	                System.out.println("you can not able to write exam see you next semester");
	            }
	    }
	        else 
	        {
	            System.out.println("your percentage is "+percentage+" can write the exam");
	        }
	    }
	        public static void main(String[] args) 
	        {
	               Scanner sc=new Scanner(System.in);
	               System.out.println("How many Class you attended");
	               try 
	               {
	                   int classAttended=sc.nextInt();
	                   if(classAttended>0)
	                   {
	                       attendExamOrNot(classAttended);
	                   }
	                   else 
	                   {
	                        System.out.println("Enter positive value");
	                   }
	                }
	                catch(InputMismatchException e)
	                {
	                        System.out.println("Enter Numberic value");
	                }
	        }
}
	         
	         
	
	
	


