//interface
package com.tns.interfaceprgm;

public interface Amazon {
	void welcome();//abstract method
	void thankyou();
	
	static int price() {
		int amt=10000;
		System.out.println("The price of the product is "+amt);
		return amt;
	}
	static void aboutUs() {
		System.out.println("The Ecommerce website for Amazon");
		
		
	}
}
