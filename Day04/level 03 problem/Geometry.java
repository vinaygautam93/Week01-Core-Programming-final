import java.util.Scanner;
import java.lang.Math;

public class Geometry {

    // Function to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Function to calculate slope and y-intercept
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);  // Calculating slope
        double yIntercept = y1 - slope * x1;   // Calculating y-intercept
        return new double[]{slope, yIntercept}; // Returning slope and y-intercept as an array
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user for two points
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculating distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        // Calculating slope and y-intercept
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println("Slope: " + lineEquation[0]);
        System.out.println("Y-Intercept: " + lineEquation[1]);

        input.close(); // Closing the scanner
    }
}