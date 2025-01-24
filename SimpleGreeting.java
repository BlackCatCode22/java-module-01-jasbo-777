// Simple Greeting.java
// JB

// https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;

public class SimpleGreeting {
    public static void main(String[] args) {
        System.out.println("\n\nWelcome to my Simple Greeting program!\n\n");


        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // String variable
        String myUserName;

        // Prompt user
        System.out.println("\n Please enter your name: ");

        // Input into variable
        myUserName = scanner.nextLine();

        // Prove
        System.out.println("\n Hello " + myUserName + " how are you today?");

    }
}