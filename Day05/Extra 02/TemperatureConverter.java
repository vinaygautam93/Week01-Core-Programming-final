import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Problem 8: Temperature Converter");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = scanner.nextInt();

        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        if (choice == 1) {
            double celsius = fahrenheitToCelsius(temperature); // Convert Fahrenheit to Celsius
            System.out.println("Temperature in Celsius: " + celsius);
        } else if (choice == 2) {
            double fahrenheit = celsiusToFahrenheit(temperature); // Convert Celsius to Fahrenheit
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
