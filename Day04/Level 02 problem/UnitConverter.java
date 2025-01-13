import java.util.Scanner;

public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for kilometers, miles, meters, and feet
        double km = scanner.nextDouble();
        double miles = scanner.nextDouble();
        double meters = scanner.nextDouble();
        double feet = scanner.nextDouble();

        // Perform and display conversions
        System.out.println(km + " km = " + convertKmToMiles(km) + " miles");
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
    }
}
