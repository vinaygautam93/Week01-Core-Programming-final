class WordLength {
    // Method to return a 2D array of words and their corresponding lengths
    // Logic: Extract each word and calculate its length
    public String[][] wordsWithLength(String text) {
        String[] words = text.split(" "); // Split the text into words
        String[][] result = new String[words.length][2]; // 2D array to store words and lengths

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];                        // Store the word
            result[i][1] = String.valueOf(words[i].length()); // Store the length as a string
        }
        return result; // Return the 2D array
    }

    // Method to display the 2D array in a tabular format
    public void display(String[][] data) {
        System.out.println("Word\tLength");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]); // Print each word and its length
        }
    }

    // Main method to take user input and display results
    public void mainMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine(); // Read input text

        // Calculate and display words with their lengths
        String[][] wordData = wordsWithLength(text);
        display(wordData);
    }
}
