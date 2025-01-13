import java.util.Scanner;

public class EnhancedDigitStorage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int maxDigit = 10; // Initial size of the array
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits with dynamic array resizing
        while (num > 0) {
            if (index == maxDigit) {
                maxDigit += 10; // Increase size
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp; // Update reference
            }
            digits[index++] = num % 10;
            num /= 10;
        }

        int largest = 0, secondLargest = 0;

        // Find largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output results
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}
