import java.util.Scanner;

public class TrigonometricFunctions {
    // Method to calculate sine, cosine, and tangent of an angle in degrees
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent using Math class
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results as an array [sine, cosine, tangent]
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the angle in degrees from the user
        System.out.println("Enter an angle in degrees:");
        double angle = scanner.nextDouble();

        // Calculate the trigonometric functions
        double[] result = calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.println("For angle " + angle + " degrees:");
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
    }
}
