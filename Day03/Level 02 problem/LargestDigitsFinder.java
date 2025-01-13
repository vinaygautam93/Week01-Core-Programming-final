import java.util.Scanner;

public class LargestDigitsFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] digits = new int[10]; // To store digits of the number
        int index = 0;

        // Extract digits from the number
        while (num > 0) {
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
