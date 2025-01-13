import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
	    // Array to store up to 10 elements
        double[] numbers = new double[10];
        // Variable to store the sum		
        double total = 0.0;    
        // Index for the array		
        int index = 0;                      
        Scanner scanner = new Scanner(System.in);

        // Infinite loop to take user input
        while (true) {
            //Enter a number
            double num = scanner.nextDouble();
            
            // Check for termination conditions
            if (num <= 0 || index == 10) {
                break;
            }

            // Store the number in the array and increment index
            numbers[index] = num;
            index++;
        }

        // Calculate the total sum using a loop
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display all numbers and the total sum
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal sum: " + total);

    }
}