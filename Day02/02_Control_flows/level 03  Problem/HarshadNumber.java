import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input number
        int number = scanner.nextInt();
        
        // Initialize sum of digits to 0
        int sum = 0;
        int temp = number;
        
        // Loop to access each digit of the number
        while (temp != 0) {
            // Add the last digit to sum
            sum += temp % 10;
            // Remove the last digit
            temp /= 10;
        }
        
        // Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
    }
}
