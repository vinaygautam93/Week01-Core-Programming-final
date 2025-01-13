import java.util.Scanner;

public class FactorUtils {

    // Method to find the factors of a number
    public int[] findFactors(int number) {
        int[] factors = new int[number]; // Create an array with a size of the number
        int count = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factors[count++] = i; // Store factor in the array
            }
        }
        factors[count++] = number; // Add the number itself as a factor
        int[] result = new int[count];
        System.arraycopy(factors, 0, result, 0, count); // Copy factors to a new array with exact size
        return result;
    }

    // Method to find the greatest factor
    public int findGreatestFactor(int[] factors) {
        int greatest = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of factors
    public int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cubes of factors
    public double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is perfect
    public boolean isPerfectNumber(int number) {
        int sum = sumOfFactors(findFactors(number)) - number;
        return sum == number;
    }

    // Method to check if a number is abundant
    public boolean isAbundantNumber(int number) {
        int sum = sumOfFactors(findFactors(number)) - number;
        return sum > number;
    }

    // Method to check if a number is deficient
    public boolean isDeficientNumber(int number) {
        int sum = sumOfFactors(findFactors(number)) - number;
        return sum < number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FactorUtils utils = new FactorUtils();
        
        // Taking user input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Find factors
        int[] factors = utils.findFactors(num);
        
        // Display results
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        
        // Greatest factor
        System.out.println("Greatest factor: " + utils.findGreatestFactor(factors));
        
        // Sum of factors
        System.out.println("Sum of factors: " + utils.sumOfFactors(factors));
        
        // Product of factors
        System.out.println("Product of factors: " + utils.productOfFactors(factors));
        
        // Product of cubes of factors
        System.out.println("Product of cubes of factors: " + utils.productOfCubeOfFactors(factors));
        
        // Check if perfect
        System.out.println("Is perfect number: " + utils.isPerfectNumber(num));
        
        // Check if abundant
        System.out.println("Is abundant number: " + utils.isAbundantNumber(num));
        
        // Check if deficient
        System.out.println("Is deficient number: " + utils.isDeficientNumber(num));


    }
}
