package numberGuess;

import java.util.Scanner;
import java.util.Random;

public class NumberG {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Create a Random object to generate a random number
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;
        int numberOfTries = 0;

        // Welcome message
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");

        // Loop until the user guesses the correct number
        while (userGuess != numberToGuess) {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfTries++;

            // Provide feedback
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number in " + numberOfTries + " tries.");
            }
        }

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}