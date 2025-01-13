import java.util.Scanner;

public class MaximumNumberOfHandshakesTwo {
    
    // Method to calculate calculate the maximum number of possible handshakes
    public int calculateThehandshakes(int numberOfStudents) {
        // formula to calculate the maximum number of possible handshakes (n * (n - 1)) / 2
        int result = (numberOfStudents * (numberOfStudents - 1)) / 2;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of students
        int numberOfStudents = sc.nextInt();

        // Create an instance of MaximumNumberOfHandshakes  class
        MaximumNumberOfHandshakesTwo obj = new MaximumNumberOfHandshakesTwo();

        // Call method to calculate possible handshakes
        int result = obj.calculateThehandshakes(numberOfStudents);

        // Print the result
        System.out.println(result);
    }
}