package com.chainsys.days6;

import java.util.Scanner;

public class Cab 
 {
	public static void cabFare(double distance, int kilometer)
	{
	Scanner sc=new Scanner(System.in);
	double cabFare=distance*kilometer;
    System.out.println("Cab Fare:Rs."+cabFare);
    System.out.print("Enter total bill amount:");
    int amount=sc.nextInt();
    double discount=0;
    if (amount> 5000) 
    {
        discount=amount*0.05;
    } 
    else if (amount > 2000) 
    {
        discount=amount*0.02; 
    }
    System.out.println("Discount applied:Rs."+discount);
    double finalBill=amount-discount;
    System.out.println("Final bill after discount:Rs."+finalBill);
    System.out.print("Enter coupon code (COUP_2 or COUP_5):");
    String couponCode=sc.next();
    double couponDiscount=0;
    if (couponCode.equalsIgnoreCase("COUP_2")) 
    {
        couponDiscount=amount*0.02; 
    } 
    else if(couponCode.equalsIgnoreCase("COUP_5"))
    {
        couponDiscount=amount*0.05; 
    }
    System.out.println("Coupon discount applied: Rs."+couponDiscount);
    finalBill=couponDiscount;
    System.out.println("Final bill after coupon discount:Rs"+finalBill);
    sc.close();

}
}
