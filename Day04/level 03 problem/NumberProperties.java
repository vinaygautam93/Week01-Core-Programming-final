import java.util.Scanner;

public class NumberProperties {

    // Method to check if a number is a prime
    boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a Neon number
    boolean isNeonNumber(int number) {
        int square = number * number;
        return sumOfDigits(storeDigits(square)) == number;
    }

    // Method to check if a number is a Spy number
    boolean isSpyNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = sumOfDigits(digits);
        int product = 1;
        for (int digit : digits) {
            product *= digit;
        }
        return sum == product;
    }

    // Method to check if a number is Automorphic
    boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is Buzz number
    boolean isBuzzNumber(int number) {
        return number % 7 == 0 || String.valueOf(number).endsWith("7");
    }

    // Utility method to count digits
    int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Utility method to store digits in an array
    int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Utility method to sum the digits
    int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Create an instance of NumberProperties
        NumberProperties np = new NumberProperties();

        // Display results for all properties
        System.out.println("\nNumber Properties:");
        System.out.println("Prime: " + np.isPrime(number));
        System.out.println("Neon: " + np.isNeonNumber(number));
        System.out.println("Spy: " + np.isSpyNumber(number));
        System.out.println("Automorphic: " + np.isAutomorphic(number));
        System.out.println("Buzz: " + np.isBuzzNumber(number));

        
    }
}
