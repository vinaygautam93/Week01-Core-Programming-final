import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the total sum to 0
        double total = 0.0;
        
        // Variable to store the user input
        double num;

        // Loop that continues until user enters 0
        while (true) {
            // Get a number from the user
            num = scanner.nextDouble();
            
            // If the user enters 0, stop the loop
            if (num == 0) {
                break;
            }
            
            // Add the entered number to the total sum
            total += num;
        }

        // Output the total sum
        System.out.println("Total sum is " + total);
    }
}
