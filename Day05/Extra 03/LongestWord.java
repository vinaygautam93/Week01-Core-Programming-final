import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a sentence
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Variable to store the longest word
        String longestWord = "";

        // Iterate through all words
        for (String word : words) {
            // Update the longest word if the current word is longer
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Output the result
        System.out.println("The longest word is: " + longestWord);

        sc.close();
    }
}
