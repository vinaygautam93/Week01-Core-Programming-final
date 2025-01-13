import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Declare variables for number1 and number2
        int number1, number2;

        // Take user input for number1 and number2
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        // Swap the numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Print the swapped result
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        // Close the scanner
        scanner.close();
    }
}
