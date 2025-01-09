import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number; // Store the original number
        int result = 0; // Initialize result to hold the sum of cubes of digits

        // Calculate the sum of cubes of digits
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            result += Math.pow(digit, 3); // Add the cube of the digit to result
            number /= 10; // Remove the last digit
        }

        // Check if the number is an Armstrong number
        if (originalNumber == result) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
