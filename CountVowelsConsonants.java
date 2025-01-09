import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase

        int vowels = 0, consonants = 0;

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if character is a letter
            if (ch >= 'a' && ch <= 'z') {
                // Check if character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Display the counts
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
