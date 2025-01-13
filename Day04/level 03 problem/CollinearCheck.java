import java.util.Scanner;

public class CollinearCheck {

    // Method to check collinearity using slope formula
    public boolean checkCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        return slopeAB == slopeBC; // If slopes are equal, points are collinear
    }

    // Method to check collinearity using area of a triangle formula
    public boolean checkCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0; // If area is zero, points are collinear
    }

    // Method to take input and check collinearity
    public void checkCollinearPoints() {
        Scanner input = new Scanner(System.in);

        // Taking input for three points
        System.out.print("Enter x1, y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2, y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter x3, y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Checking collinearity using both methods
        boolean collinearBySlope = checkCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean collinearByArea = checkCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Displaying results
        System.out.println("Collinear by Slope Formula: " + collinearBySlope);
        System.out.println("Collinear by Area Formula: " + collinearByArea);

        input.close();
    }

    public static void main(String[] args) {
        // Creating an object and calling the method
        CollinearCheck collinearCheck = new CollinearCheck();
        collinearCheck.checkCollinearPoints();
    }
}