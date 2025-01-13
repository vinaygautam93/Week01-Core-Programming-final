import java.util.Scanner;

public class NumberChecker {

    // Method to check if the number is positive or negative
    public static String checkNumber(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        }
        return "zero";
    }

    // Method to check if the number is even or odd
    public static String checkEvenOdd(int number) {
        return (number % 2 == 0) ? "even" : "odd";
    }

    // Method to compare two numbers
    public static int compareNumbers(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 is greater
        } else if (number1 == number2) {
            return 0; // numbers are equal
        }
        return -1; // number1 is smaller
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for 5 numbers
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Process the numbers and display the results
        for (int num : numbers) {
            System.out.println("Number " + num + " is " + checkNumber(num));
            if (num > 0) {
                System.out.println(num + " is " + checkEvenOdd(num));
            }
        }

        // Compare the first and last numbers
        int result = compareNumbers(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("First number is greater than last number.");
        } else if (result == 0) {
            System.out.println("First number is equal to last number.");
        } else {
            System.out.println("First number is smaller than last number.");
        }
    }
}
