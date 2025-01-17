import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and determine the status
    public String[] calculateBMIAndStatus(double weight, double height) {
        // Convert height from cm to meters
        height = height / 100;

        // Calculate BMI using the formula
        double bmi = weight / (height * height);

        // Determine the status based on BMI value
        String status = "";
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obesity";
        }

        // Returning an array with the person's weight, height, BMI, and status
        return new String[]{String.format("%.2f", weight), String.format("%.2f", height * 100), String.format("%.2f", bmi), status};
    }

    // Method to calculate BMI and status for the entire team
    public String[][] calculateAllBMIs(double[][] data) {
        // Array to store results for each person (weight, height, BMI, status)
        String[][] results = new String[data.length][4];

        // Loop through each person to calculate BMI and status
        for (int i = 0; i < data.length; i++) {
            // Get weight and height for the current person
            double weight = data[i][0];
            double height = data[i][1];

            // Create an object of the class to call the method for BMI and status
            String[] personData = calculateBMIAndStatus(weight, height);
            
            // Store the calculated data (weight, height, BMI, and status)
            results[i] = personData;
        }

        return results;
    }

    // Method to display the BMI results for all persons in a table format
    public void displayResults(String[][] results) {
        // Print the header for the table
        System.out.println("Person | Height (cm) | Weight (kg) | BMI  | Status");
        System.out.println("--------------------------------------------------------");

        // Print the data for each person
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "     | " + results[i][1] + "       | " + results[i][0] + "       | " + results[i][2] + "  | " + results[i][3]);
        }
    }

    public static void main(String[] args) {
        // Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Create a 2D array to store the weight and height of 10 persons
        double[][] data = new double[10][2];

        // Create an object of BMICalculator to call non-static methods
        BMICalculator bmiCalculator = new BMICalculator();

        // Ask the user for input for each person's weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.println("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Call the method to calculate BMI and status for the entire team
        String[][] results = bmiCalculator.calculateAllBMIs(data);

        // Display the results in a table format
        bmiCalculator.displayResults(results);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
