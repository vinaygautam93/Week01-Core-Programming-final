import java.util.Scanner;

public class DistributeChocolates {
    // Method to calculate chocolates per child and leftover chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  // Chocolates each child gets
        int remainder = number % divisor; // Leftover chocolates
        return new int[]{quotient, remainder}; // Return as array [quotient, remainder]
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for chocolates and children
        int chocolates = scanner.nextInt();
        int children = scanner.nextInt();

        // Calculate and display distribution of chocolates
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
