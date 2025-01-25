// Ask user for a series of words
// JB

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

            System.out.println("\n\n Asking for a series of spiritual words \n\n");

        // Create scanner
        Scanner scanner = new Scanner(System.in);

        // Ask for various spiritual terms
        System.out.print("Enter a spiritual practice (e.g., meditation, prayer): ");
        String practice = scanner.nextLine();

        System.out.print("Enter a positive emotion (e.g., peace, joy): ");
        String emotion = scanner.nextLine();

        System.out.print("Enter a noun related to the soul (e.g., heart, spirit): ");
        String noun = scanner.nextLine();

        System.out.print("Enter a sacred place (e.g., temple, mountaintop): ");
        String place = scanner.nextLine();

        System.out.print("Enter a verb related to spiritual growth (e.g., awaken, transcend): ");
        String verb = scanner.nextLine();

        // Construct the story
        String story = "In a world full of distractions, the soul yearns for " + emotion
                + " through the practice of " + practice + ". Every day, we seek to "
                + verb + " and connect with our inner " + noun + ". It is in places like "
                + place + " that true enlightenment can be found. The journey is long, but with "
                + practice + " and faith, peace is inevitable.";

        // Display the final story
        System.out.println("\nHere is your spiritual story:");
        System.out.println(story);
        }
    }
