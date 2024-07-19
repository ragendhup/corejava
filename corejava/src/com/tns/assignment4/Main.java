package com.tns.assignment4;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter account number: ");
            int accountNumber = scanner.nextInt();

            System.out.print("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();
            BankAccount account = new BankAccount(accountNumber, initialBalance);
            account.displayBalance();
            try {
                System.out.print("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
            } catch (InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
            try {
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
            } catch (InvalidAmountException | InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
            account.displayBalance();
        } 
        catch (InvalidAmountException e) {
            System.out.println("Failed to create account: " + e.getMessage());
        } 
        finally {
            scanner.close();
            System.out.println("Banking operations completed.");
        }
    }

}
