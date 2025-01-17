import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input a string
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int[] frequency = new int[256]; // ASCII size frequency array
        char mostFrequent = '\0';
        int maxCount = 0;

        // Count frequency of each character
        for (char ch : input.toCharArray()) {
            frequency[ch]++;
            if (frequency[ch] > maxCount) {
                maxCount = frequency[ch];
                mostFrequent = ch;
            }
        }

        // Output the result
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");

        sc.close();
    }
}
