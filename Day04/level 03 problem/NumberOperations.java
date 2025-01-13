import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOperations {

    // Method to count the number of digits
    public int countDigits(int number) {
        number = Math.abs(number); // Handle negative numbers
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store digits of the number in an array
    public int[] storeDigits(int number) {
        number = Math.abs(number); // Handle negative numbers
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to sum the digits of a number
    public int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to sum the squares of the digits of a number
    public int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit * digit; // Avoid using Math.pow for better performance
        }
        return sum;
    }

    // Method to find the frequency of digits
    public Map<Integer, Integer> findDigitFrequency(int[] digits) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int digit : digits) {
            frequency.put(digit, frequency.getOrDefault(digit, 0) + 1);
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Create an instance of NumberOperations
        NumberOperations operations = new NumberOperations();

        // Perform operations
        int[] digits = operations.storeDigits(number);
        int digitCount = operations.countDigits(number);
        int sum = operations.sumOfDigits(digits);
        int sumOfSquares = operations.sumOfSquaresOfDigits(digits);
        Map<Integer, Integer> frequency = operations.findDigitFrequency(digits);

        // Output results
        System.out.println("\nResults:");
        System.out.println("Number: " + number);
        System.out.println("Digits: " + java.util.Arrays.toString(digits));
        System.out.println("Digit Count: " + digitCount);
        System.out.println("Sum of Digits: " + sum);
        System.out.println("Sum of Squares of Digits: " + sumOfSquares);
        System.out.println("Digit Frequencies: " + frequency);

        scanner.close();
    }
}
