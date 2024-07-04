package com.tns.interfaceprgm;

public class Offers implements Amazon,Flipkart {
	public void welcome() {
		System.out.println("Welcome");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void thankyou() {
		System.out.println("thankyou");
	
	}
    public void offer() {
		
		Amazon.aboutUs();//static method
		int amazon = Amazon.price(); 
		Flipkart.aboutUs();//static method
		int flipkart = Flipkart.price();
		
		if ( amazon < flipkart) { //comparing the prices
			System.out.println("The best offers in the website of amazon: "+amazon);
		}
		else {
			System.out.println("The best offers in the website of flipkart : "+flipkart);
		}
}
}
