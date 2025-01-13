import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        long number = sc.nextLong();

        // Array to store frequency of digits (0-9)
        int[] frequency = new int[10];

        // Find and count each digit
        while (number > 0) {
            int digit = (int) (number % 10); // Extract the last digit
            frequency[digit]++; // Increment the count for the digit
            number /= 10; // Remove the last digit
        }

        // Display the frequency of each digit
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " " + frequency[i]);
            }
        }
    }
}
