import java.util.Scanner;

public class TriangularPark {

    // Method to calculate the number of rounds required
    public static int calculateRounds(double side1, double side2, double side3, double totalDistance) {
        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Calculate the number of rounds
        int rounds = (int) Math.ceil(totalDistance / perimeter);

        return rounds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the sides of the triangle
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        // Total distance athlete wants to run in meters (5 km = 5000 meters)
        double totalDistance = 5000;
		
		// Create an instance of MaximumNumberOfHandshakes  class
        TriangularPark obj = new TriangularPark();

        // Call the method to calculate the number of rounds
        int rounds = obj.calculateRounds(side1, side2, side3, totalDistance);

        // Display the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");
    }
}
