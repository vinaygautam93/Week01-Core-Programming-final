import java.util.Scanner;

public class TemperatureConversion2 {
    public static void main(String[] args) {
        // Declare a variable for Fahrenheit temperature
        double fahrenheit;

        // Take user input for Fahrenheit temperature
        Scanner scanner = new Scanner(System.in);
        fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Print the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");

        // Close the scanner
        scanner.close();
    }
}
