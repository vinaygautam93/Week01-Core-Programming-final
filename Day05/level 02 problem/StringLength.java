import java.util.Scanner;

class StringLength {
    // Method to find and return the length of a string without using length()
    public int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Access each character
                count++;            // Increment count
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates the end of the string
        }
        return count;
    }

    // Main method
    public void mainMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int customLength = findLength(input);       // Using custom method
        int builtInLength = input.length();         // Using built-in method

        System.out.println("Custom Length: " + customLength);
        System.out.println("Built-in Length: " + builtInLength);
    }
}
