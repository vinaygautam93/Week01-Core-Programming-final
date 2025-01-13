import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        // Declare variables for name, cities, and distances
        String name, fromCity, viaCity, toCity;
        double fromToVia, viaToFinalCity, timeTaken;

        // Take user input for name, cities, and distances
        Scanner scanner = new Scanner(System.in);

        // Get name and cities
        name = scanner.nextLine();
        fromCity = scanner.nextLine();
        viaCity = scanner.nextLine();
        toCity = scanner.nextLine();

        // Get distances
        fromToVia = scanner.nextDouble();
        viaToFinalCity = scanner.nextDouble();

        // Get time taken
        timeTaken = scanner.nextDouble();

        // Compute total distance
        double totalDistance = fromToVia + viaToFinalCity;

        // Print the result in the specified format
        System.out.println("The results of Int Operations are " + totalDistance + ", " + timeTaken + ", and " + (totalDistance / timeTaken));

        // Close the scanner
        scanner.close();
    }
}
