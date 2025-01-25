// Take a single character as input and display its Unicode value and whether it’s a letter or digit.
// JB

import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {

            System.out.println("\n\n Displaying Unicode \n\n");

            // Create Scanner
            Scanner scanner = new Scanner(System.in);

            // Prompt User to enter Character
            System.out.println("Enter a single character: ");
            char inputChar = scanner.next().charAt(0);

            // Get the unicode value of the chosen character
            int unicodeValue = (int) inputChar;

            // Check if character is letter or digit
            boolean isLetter = Character.isLetter(inputChar);
            boolean isDigit = Character.isDigit(inputChar);

            // Display value
            System.out.println("Unicode Value: " + unicodeValue);
            if (isLetter) {
            System.out.println(inputChar + " is a letter.");
            } else if (isDigit) {
            System.out.println(inputChar + " is a digit.");
            } else {
            System.out.println(inputChar + " is neither a letter nor a digit.");
        }
        }
    }
