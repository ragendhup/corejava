package com.tnsif.abstprgm;

public class Raki extends TaxPayer{
	public Raki(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		if (salary<=500000) {
			return salary*0.10;
		}
		else
			return salary*0.20;
	}

}
