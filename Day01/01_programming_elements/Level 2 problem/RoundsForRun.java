import java.util.Scanner;

public class RoundsForRun {
    public static void main(String[] args) {
        // Declare variables for the sides of the triangle
        double side1, side2, side3;

        // Take user input for the sides of the triangle
        Scanner scanner = new Scanner(System.in);
        side1 = scanner.nextDouble();
        side2 = scanner.nextDouble();
        side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Distance the athlete needs to run (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculate the number of rounds needed
        double rounds = totalDistance / perimeter;

        // Print the result
        System.out.println("The total number of rounds the athlete will run is " + rounds);

        // Close the scanner
        scanner.close();
    }
}
