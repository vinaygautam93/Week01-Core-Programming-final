// Class to check the voting eligibility of students based on their age
class VotingEligibility {

    // Method to check voting eligibility and return the results in a 2D array
    public String[][] checkEligibility(int[] ages) {
        // Create a 2D array to store age and eligibility status
        String[][] result = new String[ages.length][2];

        // Loop through each age to determine eligibility
        for (int i = 0; i < ages.length; i++) {
            // Store the age as a string in the first column
            result[i][0] = String.valueOf(ages[i]);

            // Check if the age is 18 or above to decide voting eligibility
            // If age is >= 18, store "Can Vote", otherwise "Cannot Vote"
            result[i][1] = ages[i] >= 18 ? "Can Vote" : "Cannot Vote";
        }

        // Return the 2D array containing the age and eligibility information
        return result;
    }

    // Method to display the voting eligibility results in a tabular format
    public void display(String[][] data) {
        // Print the table header
        System.out.println("Age\tEligibility");

        // Loop through the 2D array to print each row
        for (String[] row : data) {
            // Print the age and eligibility status in a tab-separated format
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    // Main method to execute the program
    public void mainMethod() {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Array to store the ages of 10 students
        int[] ages = new int[10];

        // Prompt the user to input the ages of 10 students
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = scanner.nextInt(); // Read each age and store it in the array
        }

        // Call the method to check eligibility and get the results
        String[][] eligibility = checkEligibility(ages);

        // Display the eligibility results using the display method
        display(eligibility);
    }
}
