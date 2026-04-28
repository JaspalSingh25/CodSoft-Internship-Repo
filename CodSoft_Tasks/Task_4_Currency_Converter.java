package TASK;

import java.util.Scanner;

public class Task_4_Currency_Converter {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Available currencies: USD, INR, EUR");

            // Input base currency
            System.out.print("Enter base currency: ");
            String base = sc.next().toUpperCase();

            // Input target currency
            System.out.print("Enter target currency: ");
            String target = sc.next().toUpperCase();

            // Input amount
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            double rate;

            // Currency conversion logic
            if (base.equals("USD") && target.equals("INR")) {
                rate = 83.0;
            } else if (base.equals("INR") && target.equals("USD")) {
                rate = 0.012;
            } else if (base.equals("USD") && target.equals("EUR")) {
                rate = 0.92;
            } else if (base.equals("EUR") && target.equals("USD")) {
                rate = 1.08;
            } else if (base.equals(target)) {
                rate = 1.0;
            } else {
                System.out.println(" Conversion not supported.");
                sc.close();
                return;
            }

            // Convert amount
            double result = amount * rate;

            // Output result
            System.out.println("\n--- Result ---");
            System.out.println("Converted Amount = " + result + " " + target);

            sc.close();
        }
    }
}