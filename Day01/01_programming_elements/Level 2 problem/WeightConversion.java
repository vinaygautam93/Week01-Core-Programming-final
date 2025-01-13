import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        // Declare variable for weight in pounds
        double weightInPounds;

        // Take user input for weight in pounds
        Scanner scanner = new Scanner(System.in);
        weightInPounds = scanner.nextDouble();

        // Convert pounds to kilograms (1 pound = 2.2 kg)
        double weightInKg = weightInPounds * 2.2;

        // Print the result
        System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKg);

        // Close the scanner
        scanner.close();
    }
}
