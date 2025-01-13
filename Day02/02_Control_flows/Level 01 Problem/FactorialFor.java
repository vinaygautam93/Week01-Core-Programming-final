import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number from the user
        int number = scanner.nextInt();
        
        // Initialize factorial to 1
        int factorial = 1;

        // Check if the number is positive
        if (number > 0) {
            // Calculate factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by i
            }

            // Output the factorial
            System.out.println("Factorial of " + number + " is " + factorial);
        } else {
            // Output if the number is not a positive integer
            System.out.println("Please enter a positive integer");
        }
    }
}
