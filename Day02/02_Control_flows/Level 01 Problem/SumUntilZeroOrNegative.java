import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the total sum to 0
        double total = 0.0;
        
        // Variable to store the user input
        double num;

        // Infinite loop, will break if a 0 or negative number is entered
        while (true) {
            // Get a number from the user
            num = scanner.nextDouble();
            
            // If the user enters 0 or a negative number, break the loop
            if (num <= 0) {
                break;
            }
            
            // Add the entered number to the total sum
            total += num;
        }

        // Output the total sum
        System.out.println("Total sum is " + total);
    }
}
