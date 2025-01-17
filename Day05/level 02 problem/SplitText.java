class SplitText {
    // Method to split text into words without using the split() method
    // Logic: Traverse the string, detect spaces, and extract words
    public String[] customSplit(String text) {
        int wordCount = 0; // Count the number of words
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // Add 1 for the last word

        String[] words = new String[wordCount]; // Create an array to store words
        int start = 0, index = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i); // Extract word
                start = i + 1; // Update starting position for the next word
            }
        }
        return words; // Return the array of words
    }

    // Method to compare two arrays of strings
    public boolean compareWords(String[] custom, String[] builtIn) {
        if (custom.length != builtIn.length) return false; // Check length mismatch
        for (int i = 0; i < custom.length; i++) {
            if (!custom[i].equals(builtIn[i])) return false; // Check word mismatch
        }
        return true; // Arrays are equal
    }

    // Main method to take user input, split text, and display results
    public void mainMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine(); // Read the input text

        // Split text using custom and built-in methods
        String[] customWords = customSplit(text);
        String[] builtInWords = text.split(" ");

        // Display results of custom split
        System.out.println("Custom Method Result:");
        for (String word : customWords) {
            System.out.print(word + " ");
        }

        // Display results of built-in split
        System.out.println("\nBuilt-in Method Result:");
        for (String word : builtInWords) {
            System.out.print(word + " ");
        }

        // Compare the results of both methods
        boolean areEqual = compareWords(customWords, builtInWords);
        System.out.println("\nWords match: " + areEqual);
    }
}

