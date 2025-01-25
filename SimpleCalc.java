// Simple Calculator
// JB

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {

            System.out.println("\n\n Create a Simple Calculator \n\n");

            // Create Scanner
            Scanner scanner = new Scanner(System.in);

            // Prompt user to enter two numbers
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Perform Operation
            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;
            double quotient = 0;

            // Division by 0
            if (num2 != 0) {
                quotient = num1 / num2;
            } else {
                System.out.println("Cannot divide by zero!");
            }

            // Results
            System.out.printf("Addition: %.2f + %.2f = %.2f\n", num1, num2, sum);
            System.out.printf("Subtraction: %.2f - %.2f = %.2f\n", num1, num2, difference);
            System.out.printf("Multiplication: %.2f * %.2f = %.2f\n", num1, num2, product);

        }
    }
