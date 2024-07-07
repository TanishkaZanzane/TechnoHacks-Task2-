package javaproject1;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
      int correctNumber = random.nextInt(100) + 1; // generates random number between 1 and 100
        int guess;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (guess < correctNumber) {
                System.out.println("Higher! Try again.");
            } else if (guess > correctNumber) {
                System.out.println("Lower! Try again.");
            } else {
                hasGuessedCorrectly = true;
            }
        }
      System.out.println("Congratulations! You've guessed the correct number " + correctNumber + " in " + attempts + " attempts.");
        scanner.close();
      }}
