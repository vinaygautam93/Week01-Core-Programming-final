import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the perimeter
        double perimeter = scanner.nextDouble();
        
        // Calculate the side of the square
        double side = perimeter / 4;
        
        // Display the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
    }
}
