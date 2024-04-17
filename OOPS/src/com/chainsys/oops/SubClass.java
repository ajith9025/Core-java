package com.chainsys.oops;

public class SubClass extends SuperClass {
		
		private void privateMethod()
		{
			System.out.println("This is a private method in SubClass");
		}

	
		public void publicMethod()
		{
			System.out.println("This is a public method in SubClass");
			privateMethod(); 
		}
	}

