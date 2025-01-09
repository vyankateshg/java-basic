import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the factorial result to 1
        int factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Display the factorial
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
