import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the number and power
        int number = scanner.nextInt();
        int power = scanner.nextInt();
        int result = 1;

        // Calculating the power using a loop
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}
