import java.util.Scanner;

public class NumberCheck {
    
    // Method to find negative number, positive, zero
    public int findNumber(int number) {
        // Find negative number, positive, zero . 
		// If number < 0 so return -1 because number is negative
        if( number < 0) {
		   return -1;
		}
		// If number > 0 so return 1 because number is positive
		else if( number > 0 ) {
		   return 1;
		}
		// If number == 0 so return 0 because number is zero
        else {
           return 0;
        }
		
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number 
        int number = sc.nextInt();

        // Create an instance of NumberCheck  class
        NumberCheck obj = new NumberCheck();

        // Call method to find negative number, positive, zero
        int result = obj.findNumber(number);

        // Print the result
        System.out.println(result);
    }
}