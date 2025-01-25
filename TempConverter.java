// Temp Converter
// JB

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

            System.out.println("\n\n Covert Temperature from Fahrenheit to Celsius \n\n");

            // Create Scanner
            Scanner scanner = new Scanner(System.in);

            // Ask user for temp in farenheit
            System.out.println("Enter the temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            // Convert to Celsius
            double celsius = (fahrenheit - 32) * 5 / 9;

            // Result with 2 decimals
            System.out.printf("Temperature in Celsius: %.2f\n", celsius);

        }
    }
