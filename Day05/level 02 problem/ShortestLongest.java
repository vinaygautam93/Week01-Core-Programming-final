class ShortestLongest {
    // Method to find the shortest and longest words in the array
    // Logic: Traverse the words array and compare lengths
    public String[] findExtremes(String[] words) {
        String shortest = words[0]; // Initialize with the first word
        String longest = words[0];  // Initialize with the first word

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word; // Update shortest word
            }
            if (word.length() > longest.length()) {
                longest = word; // Update longest word
            }
        }
        return new String[]{shortest, longest}; // Return the shortest and longest words
    }

    // Main method to take user input and display the shortest and longest words
    public void mainMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine(); // Read input text

        String[] words = text.split(" "); // Split the text into words
        String[] extremes = findExtremes(words); // Find shortest and longest words

        // Display the results
        System.out.println("Shortest Word: " + extremes[0]);
        System.out.println("Longest Word: " + extremes[1]);
    }
}
