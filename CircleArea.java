// Circle Area
// JB

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

            System.out.println("\n\n Finding the Radius \n\n");

            // Create Scanner
            Scanner scanner = new Scanner(System.in);

            // Ask for radius
            System.out.println("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            // Calculate Area using: Area = pie * r^2
            double area = Math.PI * Math.pow(radius, 2);

            // Result
            System.out.println("The area of the circle is: " + area);

        }
    }
