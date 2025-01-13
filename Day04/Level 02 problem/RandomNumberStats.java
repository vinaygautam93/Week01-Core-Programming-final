import java.util.Scanner;
import java.util.Arrays;

public class RandomNumberStats {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        // Create an array to store random numbers
        int[] randomNumbers = new int[size];

        // Loop to generate 4-digit random numbers and fill the array
        for (int i = 0; i < size; i++) {
            // Generate a random number between 1000 and 9999 (inclusive)
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;  
        }

        return randomNumbers;  // Return the array of random numbers
    }

    // Method to find the average, minimum, and maximum value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Loop through the array to calculate the sum, min, and max values
        for (int num : numbers) {
            sum += num;  // Add each number to sum
            min = Math.min(min, num);  // Update min if a smaller number is found
            max = Math.max(max, num);  // Update max if a larger number is found
        }

        // Calculate the average
        double average = sum / numbers.length;

        // Return the results as an array: average, min, max
        return new double[] { average, min, max };
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of random 4-digit values to generate
        System.out.print("Enter the number of random 4-digit numbers to generate: ");
        int size = scanner.nextInt();
        
        // Generate an array of random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(size);
        
        // Print the generated random numbers
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        // Find the average, min, and max of the random numbers
        double[] results = findAverageMinMax(randomNumbers);
        
        // Print the results: average, min, and max
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);

        scanner.close();
    }
}
