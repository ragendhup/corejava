package com.tns.interview;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        int totalSamples = 0;
        int rounds = 0;

        while (totalSamples < 30) {
            System.out.println("Enter the number of leaf samples collected in this round:");
            int samples = scanner.nextInt();

            totalSamples += samples;
            rounds++;

            System.out.println("Total samples collected: " + totalSamples);
            System.out.println("Total rounds: " + rounds);
        }

        System.out.println("Asif has collected at least 30 leaf samples and can now return home.");
        scanner.close();
	}


}
