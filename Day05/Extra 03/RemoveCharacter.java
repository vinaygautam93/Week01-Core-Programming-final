import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input the main string
        System.out.println("Enter the string:");
        String input = sc.nextLine();

        // Input the character to remove
        System.out.println("Enter the character to remove:");
        char charToRemove = sc.next().charAt(0);

        StringBuilder result = new StringBuilder();

        // Remove the specific character
        for (char ch : input.toCharArray()) {
            if (ch != charToRemove) {
                result.append(ch);
            }
        }

        // Output the result
        System.out.println("Modified String: " + result);

        sc.close();
    }
}
