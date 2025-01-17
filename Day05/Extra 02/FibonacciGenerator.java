
import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        System.out.println("Problem 4: Fibonacci Sequence Generator");

        // Get the number of terms from the user
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        Scanner scanner = new Scanner(System.in);
        int terms = scanner.nextInt();

        // Generate and display the Fibonacci sequence
        generateFibonacci(terms);
    }

    // Function to generate and print the Fibonacci sequence
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;

        // Print the first two terms
        System.out.print("Fibonacci Sequence: " + a + ", " + b);

        // Generate the rest of the terms
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}
