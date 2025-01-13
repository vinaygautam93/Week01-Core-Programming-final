import java.util.Scanner;

public class QuadraticEquation {

    // Method to find the roots of the quadratic equation ax^2 + bx + c
    public static double[] findRoots(double a, double b, double c) {
        // Calculate delta (discriminant) using the formula: delta = b^2 - 4ac
        double delta = Math.pow(b, 2) - 4 * a * c;  
        
        // Array to store roots
        double[] roots = new double[2];  

        if (delta > 0) {
            // If delta is positive, calculate two real roots
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);  // root1: (-b + sqrt(delta)) / (2a)
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);  // root2: (-b - sqrt(delta)) / (2a)
        } else if (delta == 0) {
            // If delta is zero, there is only one real root
            roots[0] = -b / (2 * a);  // root: -b / (2a)
            roots[1] = roots[0];  // Same root twice
        } else {
            // If delta is negative, no real roots exist
            return new double[] {};  // Return an empty array indicating no real roots
        }

        return roots;  // Return the calculated roots
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for coefficients a, b, and c
        double a = scanner.nextDouble();
        
        double b = scanner.nextDouble();
        
        double c = scanner.nextDouble();
        
        // Find the roots of the quadratic equation
        double[] roots = findRoots(a, b, c);
        
        if (roots.length == 0) {
            System.out.println("No real roots exist.");
        } else {
            System.out.println("Roots of the quadratic equation:");
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }

        scanner.close();
    }
}
