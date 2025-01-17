import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Problem 1: Number Guessing Game");

        // Initialize variables
        int lowerBound = 1;
        int upperBound = 100;
        boolean guessedCorrectly = false;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Game loop
        while (!guessedCorrectly) {
            int guess = random.nextInt(upperBound - lowerBound + 1) + lowerBound; // Generate a random guess
            System.out.println("Computer guesses: " + guess);

            // User provides feedback
            System.out.print("Enter 'low', 'high', or 'correct': ");
            String feedback = scanner.nextLine().toLowerCase();

            // Adjust bounds based on feedback
            if (feedback.equals("low")) {
                lowerBound = guess + 1;
            } else if (feedback.equals("high")) {
                upperBound = guess - 1;
            } else if (feedback.equals("correct")) {
                guessedCorrectly = true;
                System.out.println("The computer guessed your number!");
            } else {
                System.out.println("Invalid input. Please enter 'low', 'high', or 'correct'.");
            }
        }
    }
}
