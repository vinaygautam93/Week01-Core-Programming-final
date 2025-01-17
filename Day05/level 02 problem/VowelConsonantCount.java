// Class to count vowels and consonants in a given string
class VowelConsonantCount {

    // Method to count vowels and consonants in a string
    public int[] countVowelsConsonants(String text) {
        // Initialize counters for vowels and consonants
        int vowels = 0, consonants = 0;

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            // Convert the current character to lowercase for uniform comparison
            char ch = Character.toLowerCase(text.charAt(i));

            // Check if the character is a vowel
            if ("aeiou".indexOf(ch) != -1) {
                vowels++; // Increment vowel counter
            } 
            // Check if the character is a letter but not a vowel (i.e., a consonant)
            else if (Character.isLetter(ch)) {
                consonants++; // Increment consonant counter
            }
        }
        // Return the counts of vowels and consonants as an array
        return new int[]{vowels, consonants};
    }

    // Main method to handle user input and display results
    public void mainMethod() {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter text: ");
        String text = scanner.nextLine(); // Read the entire line as input

        // Call the method to count vowels and consonants
        int[] counts = countVowelsConsonants(text);

        // Display the counts to the user
        System.out.println("Vowels: " + counts[0]);     // Number of vowels
        System.out.println("Consonants: " + counts[1]); // Number of consonants
    }
}
