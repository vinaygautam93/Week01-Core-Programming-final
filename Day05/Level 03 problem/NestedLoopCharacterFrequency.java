import java.util.Scanner;

public class NestedLoopCharacterFrequency {
    
    // Method to find the frequency of characters in a string
    public String[][] findFrequency(String text) {
        char[] chars = text.toCharArray();  // Convert string to character array
        String[][] result = new String[chars.length][2];  // 2D array to store character and frequency
        
        // Loop through the string using nested loops
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {  // If character is not already counted
                int count = 1;  // Initialize frequency for this character
                for (int j = i + 1; j < chars.length; j++) {
                    // Check for duplicates
                    if (chars[i] == chars[j]) {
                        count++;  // Increment count for the character
                        chars[j] = '0';  // Mark the character as counted
                    }
                }
                result[i][0] = String.valueOf(chars[i]);  // Store the character
                result[i][1] = String.valueOf(count);  // Store the frequency
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from user
        System.out.println("Enter a string: ");
        String text = sc.nextLine();
        
        // Create an object of NestedLoopCharacterFrequency to call the method
        NestedLoopCharacterFrequency nlcf = new NestedLoopCharacterFrequency();
        
        // Get the frequency result from the method
        String[][] result = nlcf.findFrequency(text);
        
        // Display the result
        System.out.println("Character Frequency Using Nested Loops:");
        for (int i = 0; i < result.length; i++) {
            if (result[i][0] != null) {
                System.out.println(result[i][0] + ": " + result[i][1]);
            }
        }
    }
}
