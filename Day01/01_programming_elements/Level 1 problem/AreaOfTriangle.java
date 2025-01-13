import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and height in inches
        
        double baseInInches = scanner.nextDouble();
        double heightInInches = scanner.nextDouble();

        // Calculate area in square inches
        double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        // Convert dimensions to centimeters (1 inch = 2.54 cm)
        double baseInCm = baseInInches * 2.54;
        double heightInCm = heightInInches * 2.54;

        // Calculate area in square centimeters
        double areaInSquareCm = 0.5 * baseInCm * heightInCm;

        // Convert height to feet and inches
        int heightInFeet = (int) (heightInInches / 12); // Integer part represents feet
        double remainingInches = heightInInches % 12;  // Remaining inches

        // Output results
        
        System.out.printf("Your height in cm is " + heightInCm + " while in feet is " + heightInFeet + " feet and " + remainingInches + " and inches");


        
    }
}