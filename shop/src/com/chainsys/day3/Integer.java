package com.chainsys.day3;
import java.util.Scanner;

public class Integer
{

	public static void main(String[] args) 
	{
	

		        Scanner sc = new Scanner(System.in);
		        int sum = 0;
		        int count = 0;
		        long product = 1;

		        while (true) 
		        {
		            System.out.print("Enter an integer (press 'q' to quit): ");
		            String input = sc.nextLine();

		            if (input.equalsIgnoreCase("q")) 
		            {
		                break;
		            }

		        }

		           if (count == 0) 
		           {
		              System.out.println("No numbers entered.");
		           }
		           else
		          {
		            double average = (double) sum / count;
		            System.out.println("Average: " + average);
		            System.out.println("Product: " + product);
		          }
		           sc.close();
	}
}


	


	


		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           


		
	