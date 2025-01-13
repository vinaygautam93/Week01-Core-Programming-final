import java.util.Scanner;

public class QuotientAndRemainder {
    // Method to calculate the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  // Calculate quotient
        int remainder = number % divisor; // Calculate remainder
        return new int[]{quotient, remainder}; // Return as array [quotient, remainder]
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two numbers from the user
        int number = scanner.nextInt();
        int divisor = scanner.nextInt();

        // Calculate and display the quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
    }
}
