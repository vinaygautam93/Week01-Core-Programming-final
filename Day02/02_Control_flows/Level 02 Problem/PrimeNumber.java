import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input number
        int number = scanner.nextInt();
        
        // Check if the number is greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            // Assume number is prime
            boolean isPrime = true;
            
            // Check divisibility from 2 to number-1
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    // Number is divisible, so it's not prime
                    isPrime = false;
                    break;
                }
            }
            
            // Output result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}
