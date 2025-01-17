import java.util.Scanner;

public class StringCharacterComparison {

    // Instance method to manually convert a string into a character array
    public char[] convertToCharArray(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i); // Access each character and store in the array
        }
        return charArray;
    }

    // Instance method to compare two character arrays
    public boolean compareCharArrays(char[] array1, char[] array2) {
        // If lengths are not the same, they can't be equal
        if (array1.length != array2.length) {
            return false;
        }

        // Check each character for equality
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // Return false if any character differs
            }
        }

        return true; // Arrays are equal
    }

    public void run() {
        // Take user input for the string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.next();

        // Call the instance methods
        char[] customCharArray = this.convertToCharArray(input);

        // Use the built-in toCharArray method
        char[] builtInCharArray = input.toCharArray();

        // Compare the results
        boolean areEqual = this.compareCharArrays(customCharArray, builtInCharArray);

        // Display the results
        System.out.println("Custom method result: " + new String(customCharArray));
        System.out.println("Built-in method result: " + new String(builtInCharArray));
        System.out.println("Are both arrays equal? " + areEqual);

        scanner.close(); // Close the scanner to avoid resource leaks
    }

    public static void main(String[] args) {
        // Create an instance of the class and run the program
        StringCharacterComparison comparison = new StringCharacterComparison();
        comparison.run();
    }
}
