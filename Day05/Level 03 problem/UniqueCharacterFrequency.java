import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find unique characters in a string
    public String[] uniqueCharacters(String text) {
        boolean[] seen = new boolean[256];  // Array to track which characters have been seen
        StringBuilder uniqueChars = new StringBuilder();  // StringBuilder to store unique characters
        
        // Loop through the string and check if the character is already seen
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!seen[c]) {
                uniqueChars.append(c);  // Add unique character to the result
                seen[c] = true;  // Mark this character as seen
            }
        }
        
        return uniqueChars.toString().split("");  // Return unique characters as an array
    }

    // Method to find the frequency of characters in the string
    public String[][] findFrequency(String text) {
        String[] uniqueChars = uniqueCharacters(text);  // Get unique characters
        int[] frequency = new int[256];  // Array to store frequency of characters
        String[][] result = new String[uniqueChars.length][2];  // 2D array to store the character and its frequency
        
        // Loop to calculate the frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;  // Increment frequency of the character
        }

        // Store unique characters and their frequencies in the result array
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = uniqueChars[i];  // Store character
            result[i][1] = String.valueOf(frequency[uniqueChars[i].charAt(0)]);  // Store frequency
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from user
        System.out.println("Enter a string: ");
        String text = sc.nextLine();
        
        // Create an object of UniqueCharacterFrequency to call methods
        UniqueCharacterFrequency ucf = new UniqueCharacterFrequency();
        
        // Get the frequency result from the method
        String[][] result = ucf.findFrequency(text);
        
        // Display the result
        System.out.println("Unique Character Frequency:");
        for (int i = 0; i < result.length; i++) {
            if (result[i][0] != null) {
                System.out.println(result[i][0] + ": " + result[i][1]);
            }
        }
    }
}
