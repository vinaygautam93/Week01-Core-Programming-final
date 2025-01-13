import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the number
        int number = scanner.nextInt();
        int greatestFactor = 1;

        // Finding the greatest factor using a loop
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest factor of " + number + " besides itself is: " + greatestFactor);
    }
}
