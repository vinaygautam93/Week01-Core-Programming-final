import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = (number2 != 0) ? number1 / number2 : Double.NaN; // Handle division by zero

        // Print the results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " +
                number1 + " and " + number2 + " is " +
                addition + ", " + subtraction + ", " + multiplication + ", and " +
                (number2 != 0 ? division : "undefined (division by zero)"));

        
    }
}
