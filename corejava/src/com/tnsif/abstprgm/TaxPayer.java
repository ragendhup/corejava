package com.tnsif.abstprgm;

public  abstract class TaxPayer {
	protected double salary;//instant variable
	public TaxPayer(double salary) {//parameterized constructor
		super();
		this.salary = salary;
	}
	public abstract double calTax();//abstract method
	
	public void display() {//non abstract method
		System.out.println("the tax payed is "+calTax());	
	}

}
