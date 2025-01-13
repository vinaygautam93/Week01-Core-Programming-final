import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input number
        int number = scanner.nextInt();
        
        // Initialize count to 0
        int count = 0;
        
        // Loop until the number becomes 0
        while (number != 0) {
            // Remove the last digit and increase count
            number /= 10;
            count++;
        }
        
        // Display the count of digits
        System.out.println("Number of digits: " + count);
    }
}
