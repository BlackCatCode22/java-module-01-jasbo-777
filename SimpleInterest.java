// Calculate Simple Interest
// JB

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

            System.out.println("\n\n Calculate the simple interest based on user inputs for principal, rate, and time \n\n");

            // Create Scanner
            Scanner scanner = new Scanner(System.in);

            // Prompt the user
            System.out.print("Enter the principal amount: ");
            double principal = scanner.nextDouble();

            // Prompt user to enter the rate of interest
            System.out.print("Enter the rate of interest (in percentage): ");
            double rate = scanner.nextDouble();

            // Prompt user to enter the time period
            System.out.print("Enter the time period in years: ");
            double time = scanner.nextDouble();

            // Calculate the simple interest
            double simpleInterest = (principal * rate * time) / 100;

            // Result
            System.out.println("The simple interest is: " + simpleInterest);
        }
    }
