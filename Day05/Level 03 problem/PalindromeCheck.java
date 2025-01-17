import java.util.Scanner;

public class PalindromeCheck {

    // Method to check if the string is palindrome using start and end comparison
    public boolean isPalindrome(String text) {
        int start = 0;  // Start index
        int end = text.length() - 1;  // End index
        
        // Loop through the string from both ends and check if characters are equal
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;  // If characters don't match, return false
            }
            start++;  // Move start index forward
            end--;  // Move end index backward
        }
        return true;  // If all characters match, return true
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from user
        System.out.println("Enter a string: ");
        String text = sc.nextLine();
        
        // Create an object of PalindromeCheck to call the method
        PalindromeCheck pc = new PalindromeCheck();
        
        // Check if the text is palindrome
        if (pc.isPalindrome(text)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
