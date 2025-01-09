import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        // Welcome message and instructions
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        int guess; // To hold user's guess
        int attempts = 0; // Count number of attempts

        // Loop until the user guesses the correct number
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            // Provide hints based on the guess
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        } while (guess != targetNumber);
    }
}
