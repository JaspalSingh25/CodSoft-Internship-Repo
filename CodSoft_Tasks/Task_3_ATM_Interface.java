package TASK;

import java.util.Scanner;

public class Task_3_ATM_Interface {

    // Bank Account Class
    static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit successful!");
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdraw(double amount) {
            if (amount <= balance && amount > 0) {
                balance -= amount;
                System.out.println("Withdrawal successful!");
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            BankAccount account = new BankAccount(1000);
            int choice;

            do {
                System.out.println("\n--- ATM Menu ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();
            
                  
               switch (choice) {
                case 1 -> System.out.println("Current Balance: " + account.getBalance());
                case 2 -> {
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                }
                case 3 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                }
                case 4 -> System.out.println("Thank you for using ATM!");
                default -> System.out.println("Invalid choice. Try again.");
            }

            } while (choice != 4);
        }
    }
}