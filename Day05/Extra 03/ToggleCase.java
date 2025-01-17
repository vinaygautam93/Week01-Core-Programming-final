import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input a string
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        StringBuilder toggledString = new StringBuilder();

        // Toggle case for each character
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggledString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledString.append(Character.toUpperCase(ch));
            } else {
                toggledString.append(ch); // Keep non-alphabetic characters as is
            }
        }

        // Output the result
        System.out.println("Toggled string: " + toggledString);

        sc.close();
    }
}
