package com.tns.exception;

public class nested {
	public static void main(String args[]) {
	String str="tns";
	int arr[]=null;
	int y=6;
	try {//outer try
		int z=y/0;//exception in outer try
		try {//inner try
			System.out.println(arr[0]);
			System.out.println(str.charAt(y));
			
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("exception"+e.getMessage());
			
		}
		catch(NullPointerException e) {
			System.out.println("exception nullpointer"+e.getMessage());
		}	
		
		}
		catch(ArithmeticException e) {
			System.out.println("exception"+e.getMessage());
			
	}
	}

	
		
	
	
	

}
