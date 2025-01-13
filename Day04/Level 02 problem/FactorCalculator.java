import java.util.Scanner;

public class FactorCalculator {
    
    // Method to find factors of a number
    public static int[] findFactors(int number) {
        int count = 0;
        
        // Count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        // Store factors in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to calculate the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor; // Add each factor to the sum
        }
        return sum;
    }

    // Method to calculate the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor; // Multiply each factor to get the product
        }
        return product;
    }

    // Method to calculate the sum of squares of factors
    public static int sumOfSquares(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2); // Add the square of each factor to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        int number = scanner.nextInt();
        
        // Find factors of the given number
        int[] factors = findFactors(number);

        // Calculate and print results
        System.out.println("Factors of the number:");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        
        // Calculate and display the sum, product, and sum of squares of the factors
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
    }
}
