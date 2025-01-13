import java.util.Scanner;

public class NumberUtils {

    // Method to find the count of digits in the number
    public int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store the digits of the number in a digits array
    public int[] storeDigits(int num) {
        int digitCount = countDigits(num);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public void reverseArray(int[] digits) {
        int left = 0, right = digits.length - 1;
        while (left < right) {
            int temp = digits[left];
            digits[left] = digits[right];
            digits[right] = temp;
            left++;
            right--;
        }
    }

    // Method to compare two arrays and check if they are equal
    public boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if a number is a palindrome using the digits
    public boolean isPalindrome(int num) {
        int[] originalDigits = storeDigits(num);
        int[] reversedDigits = originalDigits.clone();
        reverseArray(reversedDigits);
        return compareArrays(originalDigits, reversedDigits);
    }

    // Method to check if a number is a duck number using the digits array
    public boolean isDuckNumber(int num) {
        int[] digits = storeDigits(num);
        for (int digit : digits) {
            if (digit != 0) {
                return true; // Contains non-zero digit, it's a duck number
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberUtils utils = new NumberUtils();
        
        // Taking user input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Count digits
        System.out.println("Number of digits: " + utils.countDigits(num));

        // Store digits in an array
        int[] digits = utils.storeDigits(num);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Reverse the digits array
        utils.reverseArray(digits);
        System.out.print("Reversed Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Check if the number is a palindrome
        System.out.println("Is Palindrome: " + utils.isPalindrome(num));

        // Check if the number is a duck number
        System.out.println("Is Duck Number: " + utils.isDuckNumber(num));

        scanner.close();
    }
}
