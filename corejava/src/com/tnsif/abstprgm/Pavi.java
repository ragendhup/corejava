package com.tnsif.abstprgm;

public class Pavi extends TaxPayer{
	public Pavi(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		return salary*0.15;
	}

}
