import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        System.out.println("Problem 3: Prime Number Checker");

        // Get input from the user
        System.out.print("Enter a number to check if it's prime: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = checkPrime(number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean checkPrime(int num) {
        if (num <= 1) return false; // Numbers less than or equal to 1 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Number is divisible by a smaller number
            }
        }
        return true;
    }
}
