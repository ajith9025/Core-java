
package com.chainsys.day10;

public class ABCGrocery extends Grocery implements GroceryDetails{

	
	@Override
	public String addToWelcome() {
		// TODO Auto-generated method stub
		System.out.println(" Welcome to all the user of the GroceryApp ");
		return null;
	}
	
	
	@Override
	public String addToAddress() {
		// TODO Auto-generated method stub
		System.out.println("1/55,south street,alatur(Tk),perambalur(Dt),621204");
		return null;
	}

	@Override
	public String customerName() {
		// TODO Auto-generated method stub
		System.out.println("HARI D");
		return null;
	}

	@Override
	public String review() {
		// TODO Auto-generated method stub
		System.out.println("this product is very nice product,very good");
		return null;
		
	}

	@Override
	public String location() {
		// TODO Auto-generated method stub
		System.out.println("perambalur");
		return null;
	}

	@Override
	public String thanksInformation() {
		// TODO Auto-generated method stub
		System.out.println("Thank you for using the GroceryApp");
		return null;
	}
		
	}



