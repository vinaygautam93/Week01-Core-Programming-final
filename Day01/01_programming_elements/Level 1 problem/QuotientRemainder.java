import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Take two numbers as input
        //Enter first number
        int num1 = sc.nextInt();
        
        //Enter second number: ");
        int num2 = sc.nextInt();
        
        // Calculate quotient and remainder
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        
        // Output the result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + num1 + " and " + num2);
        
        
    }
}
