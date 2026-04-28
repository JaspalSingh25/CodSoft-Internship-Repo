package TASK;

import java.util.Random;
import java.util.Scanner;

public class Task_1_Number_game {  // Guess game 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int score = 0;
        char choice = 'y';
        
        while (choice == 'y') {
            
            int number = rand.nextInt(100) + 1;
            int maxAttempts = 5;
            boolean correct = false;
            
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have 5 chances");
            
            for (int i = 1; i <= maxAttempts; i++) {
                
                System.out.println("Enter your guess:");
                int guess = sc.nextInt();
                
                if (guess == number) {
                    System.out.println("You guessed right!");
                    score++;
                    correct = true;
                    break;
                } else if (guess > number) {
                    System.out.println("Your number is high");
                } else {
                    System.out.println("Your number is low");
                }
            }
            
            if (!correct) {
                System.out.println("You lost");
                System.out.println("Correct number was " + number);
            }
            
            System.out.println("Your score is " + score);
            
            System.out.println("Do you want to play again? (y/n)");
            choice = sc.next().charAt(0);
        }
        
        System.out.println("Game finished");
    }
}