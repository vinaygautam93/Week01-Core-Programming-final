import java.util.Scanner;

public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number n from the user
        int n = scanner.nextInt();

        // Check if the number is a valid natural number
        if (n > 0) {
            // Calculate the sum using the formula n * (n + 1) / 2
            int formulaSum = (n * (n + 1)) / 2;

            // Calculate the sum using a while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i; // Add i to the sum
                i++; // Increment i
            }

            // Output both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using loop: " + loopSum);
        } else {
            // Output if the number is not a valid natural number
            System.out.println(n + " is not a natural number");
        }
    }
}
