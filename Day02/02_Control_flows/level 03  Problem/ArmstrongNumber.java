import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input number
        int number = scanner.nextInt();
        
        // Initialize sum and originalNumber variables
        int sum = 0;
        int originalNumber = number;
        
        // Loop until the number becomes 0
        while (number != 0) {
            // Find the last digit of the number
            int digit = number % 10;
            
            // Find the cube of the digit and add to the sum
            sum += Math.pow(digit, 3);
            
            // Remove the last digit
            number /= 10;
        }
        
        // Check if the sum equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
