import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        // Declare variables a, b, and c
        int a, b, c;

        // Take user input for a, b, and c
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        // Compute the integer operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Print the results
        System.out.println(" The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", " + result4);

        
    }
}