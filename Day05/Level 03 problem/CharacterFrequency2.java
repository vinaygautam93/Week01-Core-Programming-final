import java.util.Scanner;

public class CharacterFrequency2 {
    
    // Method to find the frequency of characters
    public String[][] findFrequency(String text) {
        int[] frequency = new int[256];  // Array to store frequency of ASCII characters
        String[][] result = new String[256][2];  // 2D array to store character and its frequency
        
        // Loop through the string and count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);  // Get the character at position i
            frequency[c]++;  // Increment the frequency of this character
        }
        
        // Now, prepare the result array to store characters and their frequencies
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);  // Store character
                result[index][1] = String.valueOf(frequency[i]);  // Store frequency
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from user
        System.out.println("Enter a string: ");
        String text = sc.nextLine();
        
        // Create an object of CharacterFrequency2 to call the method
        CharacterFrequency2 cf = new CharacterFrequency2();
        
        // Get the frequency result from the method
        String[][] result = cf.findFrequency(text);
        
        // Display the result
        System.out.println("Character Frequency:");
        for (int i = 0; result[i][0] != null; i++) {
            System.out.println(result[i][0] + ": " + result[i][1]);
        }
    }
}
