import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // Declare variables a, b, and c of double type
        double a, b, c;

        // Take user input for a, b, and c
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        // Compute the double operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Print the results
        System.out.println(" The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", " + result4);

    }
}
