import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Problem 2: Maximum of Three Numbers");

        // Get inputs from the user
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");

        // Calculate the maximum
        int max = findMax(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);
    }

    // Function to take input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to find the maximum of three numbers
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
