package com.tns.interview;
import java.util.Scanner;
public class Marble {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
	        int totalMarbles = 10;

	        while (totalMarbles > 0) {
	            System.out.println("Enter the color of the marble (blue, red, or other):");
	            String color = scanner.nextLine().trim().toLowerCase();

	            if (color.equals("blue") || color.equals("red")) {
	                totalMarbles--;
	                System.out.println("Marble removed. Number of marbles left: " + totalMarbles);
	            } else {
	                System.out.println("Marble retained. Number of marbles left: " + totalMarbles);
	            }
	        }

	        System.out.println("No more marbles left.");
	        scanner.close();
	    }

}
