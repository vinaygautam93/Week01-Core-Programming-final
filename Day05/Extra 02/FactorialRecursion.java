import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println("Problem 6: Factorial Using Recursion");

        int number = getInput(); // Get input from the user
        int factorial = calculateFactorial(number); // Calculate the factorial
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Function to get input from the user
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    // Recursive function to calculate factorial
    public static int calculateFactorial(int n) {
        if (n <= 1) {
            return 1; // Base case
        }
        return n * calculateFactorial(n - 1); // Recursive call
    }
}
