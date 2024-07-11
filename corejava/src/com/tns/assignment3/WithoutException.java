package com.tns.assignment3;

 class WithoutException {
	public static void main(String args[]){
		int d=0;
		try {
		int a=42/d;// exception is raised
		System.out.println("ragendhu");
		}
		catch(ArithmeticException e) {
			System.out.println("exception handled successfully" + e.getMessage());
		}
		System.out.println("will not be printed");
	}

}
