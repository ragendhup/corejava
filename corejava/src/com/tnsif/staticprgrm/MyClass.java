package com.tnsif.staticprgrm;

public class MyClass {
	private int section;//instance
	static int srno;//static
	
	static {
		System.out.println("static block");
		srno=1000;
		//section++;
		
		
	}

	public MyClass() {
		super();
		
		System.out.println("default constructor");
		
	}
	static void display() {
		System.out.println("static method");
		System.out.println("the serial no is"+srno++);
	}
	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}
	
	

}
