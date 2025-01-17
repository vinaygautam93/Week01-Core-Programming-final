import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;  // If lengths are not equal, they cannot be anagrams
        }

        int[] frequency1 = new int[256];  // Frequency array for first string
        int[] frequency2 = new int[256];  // Frequency array for second string
        
        // Calculate the frequency of characters in both strings
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;  // If frequencies don't match, not anagrams
            }
        }

        return true;  // If all frequencies match, they are anagrams
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from user
        System.out.println("Enter first string: ");
        String text1 = sc.nextLine();
        
        System.out.println("Enter second string: ");
        String text2 = sc.nextLine();
        
        // Create an object of AnagramCheck to call the method
        AnagramCheck ac = new AnagramCheck();
        
        // Check if the strings are anagrams
        if (ac.areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
    }
}
