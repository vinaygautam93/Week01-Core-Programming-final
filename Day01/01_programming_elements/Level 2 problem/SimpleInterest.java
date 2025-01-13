import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Declare variables for principal, rate, and time
        double principal, rate, time;

        // Take user input for principal, rate, and time
        Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        principal = scanner.nextDouble();
        rate = scanner.nextDouble();
        time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time);

        // Close the scanner
        scanner.close();
    }
}
