
import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input the main string
        System.out.println("Enter the main string:");
        String mainString = sc.nextLine();

        // Input the substring to search for
        System.out.println("Enter the substring to count:");
        String substring = sc.nextLine();

        int count = 0; // Counter for occurrences
        int index = 0;

        // Search for the substring in the main string
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move index forward
        }

        // Output the result
        System.out.println("The substring occurs " + count + " times.");

        sc.close();
    }
}
