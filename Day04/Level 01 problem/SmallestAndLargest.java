import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for three numbers
        int num1 = scanner.nextInt(); // First number
        int num2 = scanner.nextInt(); // Second number
        int num3 = scanner.nextInt(); // Third number

        // Call the method to find the smallest and largest
        int[] result = findSmallestAndLargest(num1, num2, num3);

        // Display the results
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
    }

    // Method to find smallest and largest numbers among three
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        // Find the smallest number using Math.min
        int smallest = Math.min(number1, Math.min(number2, number3));

        // Find the largest number using Math.max
        int largest = Math.max(number1, Math.max(number2, number3));

        // Return the results as an array [smallest, largest]
        return new int[]{smallest, largest};
    }
}
