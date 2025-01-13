import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the countdown start value from the user
        int counter = scanner.nextInt();

        // Loop to print numbers from the counter down to 1
        for (int i = counter; i > 0; i--) {
            // Print the current value of i
            System.out.println(i);
        }
    }
}
