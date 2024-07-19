package com.tns.assignment4;

public class BankAccount {
	 private double balance;
     public BankAccount(int accountNumber, double initialBalance) throws InvalidAmountException {
     if (initialBalance < 0) {
         throw new InvalidAmountException("Initial balance cannot be negative.");
     }
     this.balance = initialBalance;
 }
      public void deposit(double amount) throws InvalidAmountException {
         if (amount <= 0) {
             throw new InvalidAmountException("Deposit amount must be positive.");
     } 
         balance += amount;
         System.out.println("Deposited " + amount + ". New balance: " + balance);
 }
      public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
          if (amount <= 0) {
              throw new InvalidAmountException("Withdrawal amount must be positive.");
     } 
          if (amount > balance) {
          throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
     }
         balance -= amount;
         System.out.println("Withdrew " + amount + ". New balance: " + balance);
 }

      public void displayBalance() {
         System.out.println("Current balance: " + balance);

 }
}
