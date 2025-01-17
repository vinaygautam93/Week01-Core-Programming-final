// Class to demonstrate how to trim leading and trailing spaces from a string
class TrimSpaces {

    // Method to trim leading and trailing spaces from a string manually
    public String trimSpaces(String text) {
        // Initialize pointers for the start and end of the string
        int start = 0, end = text.length() - 1;

        // Move the start pointer forward as long as it points to a space
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Move the end pointer backward as long as it points to a space
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        // Return the substring from the updated start to end pointers
        return text.substring(start, end + 1);
    }

    // Main method to demonstrate the functionality of trimming spaces
    public void mainMethod() {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string with spaces
        System.out.print("Enter text with spaces: ");
        String text = scanner.nextLine(); // Read the entire line as input

        // Call the method to trim spaces using the custom logic
        String trimmed = trimSpaces(text);

        // Display the trimmed string using the custom method
        System.out.println("Trimmed Text (Custom): " + trimmed);

        // Display the trimmed string using the built-in trim() method
        System.out.println("Trimmed Text (Built-in): " + text.trim());
    }
}
