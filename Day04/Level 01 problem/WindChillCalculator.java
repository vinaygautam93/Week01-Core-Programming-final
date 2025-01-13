import java.util.Scanner;

public class WindChillCalculator {
    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Use the formula provided to calculate wind chill
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get temperature and wind speed from the user
        System.out.println("Enter temperature (in Fahrenheit) and wind speed (in mph):");
        double temperature = scanner.nextDouble();
        double windSpeed = scanner.nextDouble();

        // Calculate and display the wind chill temperature
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("The wind chill temperature is: " + windChill + "°F");
    }
}
