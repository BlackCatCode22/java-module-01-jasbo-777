// Favourite Number
//JB

import java.util.Scanner;

public class FavouriteNumber {
    public static void main(String[] args) {

            System.out.println("\n\n My Favourite Number \n\n");

        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt User to enter fave number
        System.out.println("\n\n Enter your favourite number: \n\n");

        // Read user input
        int favouriteNumber = scanner.nextInt();

        // Message with users fave number
        System.out.println(" Your favourite number is: " + favouriteNumber);

        }
    }
