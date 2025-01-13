import java.util.Scanner;

public class MaximumNumberOfHandshakes {
    
    // Method to calculate calculate the maximum number of possible handshakes
    public int calculateThehandshakes(int number) {
        // formula to calculate the maximum number of possible handshakes (n * (n - 1)) / 2
        int result = (number * (number - 1)) / 2;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of students
        int number = sc.nextInt();

        // Create an instance of MaximumNumberOfHandshakes  class
        MaximumNumberOfHandshakes obj = new MaximumNumberOfHandshakes();

        // Call method to calculate possible handshakes
        int result = obj.calculateThehandshakes(number);

        // Print the result
        System.out.println(result);
    }
}