import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        // Declare variables for number of chocolates and number of children
        int numberOfChocolates, numberOfChildren;

        // Take user input for the number of chocolates and number of children
        Scanner scanner = new Scanner(System.in);
        numberOfChocolates = scanner.nextInt();
        numberOfChildren = scanner.nextInt();

        // Calculate the number of chocolates each child gets and the remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Print the result
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + 
                           " and the number of remaining chocolates are " + remainingChocolates);

        // Close the scanner
        scanner.close();
    }
}
