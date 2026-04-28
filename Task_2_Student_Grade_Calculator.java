package TASK;

import java.util.Scanner;

public class Task_2_Student_Grade_Calculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input number of subjects
        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();

        if (numSubjects <= 0) {
            System.out.println("Invalid number of subjects!");
            return;
        }

        double totalMarks = 0;

        // Input marks with validation
        for (int i = 1; i <= numSubjects; i++) {
            double marks;

            while (true) {
                System.out.print("Enter marks for subject " + i + " (0-100): ");
                marks = sc.nextDouble();

                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Invalid input! Marks must be between 0 and 100.");
                }
            }

            totalMarks += marks;
        }

        double averagePercentage = totalMarks / numSubjects;

        String grade;

        if (averagePercentage >= 90) grade = "A+";
        else if (averagePercentage >= 80) grade = "A";
        else if (averagePercentage >= 70) grade = "B";
        else if (averagePercentage >= 60) grade = "C";
        else if (averagePercentage >= 50) grade = "D";
        else grade = "F";

        System.out.println("\n--- Result ---");
        System.out.println("Total Marks = " + totalMarks);
        System.out.printf("Average Percentage = %.2f%%\n", averagePercentage);
        System.out.println("Grade = " + grade);

    }
}