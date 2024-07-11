//multiple try catch
package com.tns.exception;

public class Trycatch {
	public static void divide() {
	int a=9,b=0,c;
	try {
		c=a/b;//exception raised
		//exception 
		
	}
	catch(ArithmeticException e) {
		System.out.println("exception caught"+e.getMessage());
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("exception caught"+e.getMessage());
		
	}
	catch(Exception e) {
		System.out.println("exception caught"+e.getMessage());
		
	}
	
	
	}
}
