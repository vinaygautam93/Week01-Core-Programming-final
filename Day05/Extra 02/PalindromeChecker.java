import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("Problem 5: Palindrome Checker");

        String input = getInput(); // Get input from the user
        boolean isPalindrome = checkPalindrome(input); // Check if it's a palindrome

        // Display the result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    // Function to get input from the user
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    // Function to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase(); // Remove spaces and convert to lowercase
        int left = 0, right = str.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
