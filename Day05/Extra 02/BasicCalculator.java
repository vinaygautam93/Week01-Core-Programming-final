import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println("Problem 9: Basic Calculator");

        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");

        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = new Scanner(System.in).nextInt();

        double result = 0;
        switch (choice) {
            case 1 -> result = add(num1, num2);
            case 2 -> result = subtract(num1, num2);
            case 3 -> result = multiply(num1, num2);
            case 4 -> result = divide(num1, num2);
            default -> System.out.println("Invalid choice.");
        }

        if (choice >= 1 && choice <= 4) {
            System.out.println("Result: " + result);
        }
    }

    // Function to get input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Functions for basic mathematical operations
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }
}
