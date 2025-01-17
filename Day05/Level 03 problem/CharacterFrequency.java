import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters using charAt() method
    public String[][] findFrequency(String text) {
        int[] freq = new int[256];  // Array to store frequency of each character
        StringBuilder result = new StringBuilder();
        
        // Count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        
        // Build the result by storing characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result.append((char) i).append(": ").append(freq[i]).append("\n");
            }
        }
        
        String[] output = result.toString().split("\n");
        String[][] outputArray = new String[output.length][2];
        
        for (int i = 0; i < output.length; i++) {
            outputArray[i] = output[i].split(": ");
        }
        
        return outputArray;
    }

    // Main function to test the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharacterFrequency obj = new CharacterFrequency();
        
        System.out.println("Enter the text:");
        String text = scanner.nextLine();
        
        // Get frequency of characters and display the result
        String[][] frequency = obj.findFrequency(text);
        
        System.out.println("Character Frequencies:");
        for (String[] entry : frequency) {
            System.out.println(entry[0] + ": " + entry[1]);
        }
        
        scanner.close();
    }
}
