import java.util.Scanner;

public class NaturalNumberSum {
    
    // Method to calculate the sum of natural numbers using recursion
    public static int sumOfNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }

    // Method to calculate the sum using the formula
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        int n = scanner.nextInt();
        
        // Calculate sum using recursion and the formula
        int recursiveSum = sumOfNaturalNumbers(n);
        int formulaSum = sumFormula(n);

        // Display the results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
    }
}
