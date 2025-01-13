import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Declare a variable for Celsius temperature
        double celsius;

        // Take user input for Celsius temperature
        Scanner scanner = new Scanner(System.in);
        celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Print the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");

        // Close the scanner
        scanner.close();
    }
}
