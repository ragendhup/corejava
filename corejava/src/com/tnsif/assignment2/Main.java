package com.tnsif.assignment2;

public class Main {
	public static void main(String[] args) {
		new Student();

        // Creating Commission object
        Comission commission = new Comission();

        // Accepting details of the sales employee
        commission.acceptDetails("Ragendhu", "167 bengaluru", "9089756443", 75000);

        // Calculating and displaying the commission
        commission.displayCommission();
    }

}
