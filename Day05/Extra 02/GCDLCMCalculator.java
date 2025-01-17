import java.util.Scanner;

public class GCDLCMCalculator {
    public static void main(String[] args) {
        System.out.println("Problem 7: GCD and LCM Calculator");

        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");

        int gcd = calculateGCD(num1, num2); // Calculate GCD
        int lcm = calculateLCM(num1, num2, gcd); // Calculate LCM using GCD
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    // Function to get input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to calculate GCD using Euclid's algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using the formula LCM = (a * b) / GCD
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
