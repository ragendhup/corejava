package com.tns.interview;
import java.util.Scanner;

public class Hospital {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
        int totalOrders = 0;
        int hospitalsVisited = 10;

        for (int i = 1; i <= hospitalsVisited; i++) {
            System.out.println("Enter the pincode of hospital " + i + ":");
            int pincode = scanner1.nextInt();

            if (pincode % 2 == 0) {
                totalOrders += 100;
                System.out.println("Order placed for 100 masks.");
            } else {
                System.out.println("Order rejected.");
            }
        }
	}

}
