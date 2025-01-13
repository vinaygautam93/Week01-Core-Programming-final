import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number from the user
        int number = scanner.nextInt();

        // Check if the number is a valid natural number
        if (number > 0) {
            // Loop through numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            // Output if the number is not a valid natural number
            System.out.println("Please enter a positive integer");
        }
    }
}
