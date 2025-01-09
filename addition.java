import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the first number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        // Prompt user for the second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Display the sum
        System.out.println("The sum is: " + sum);
    }
}
