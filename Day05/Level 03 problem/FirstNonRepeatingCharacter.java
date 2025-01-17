import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character
    public char findFirstNonRepeating(String text) {
        int[] freq = new int[256];  // Array to store frequency of each character
        
        // Count the frequency of each character in the text
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        
        // Find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        
        return '\0';  // Return null character if no non-repeating character found
    }

    // Main function to test the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FirstNonRepeatingCharacter obj = new FirstNonRepeatingCharacter();
        
        System.out.println("Enter the text:");
        String text = scanner.nextLine();
        
        // Find and display the first non-repeating character
        char result = obj.findFirstNonRepeating(text);
        
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        
        scanner.close();
    }
}
