import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for rows and columns
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        // Validate input
        if (rows <= 0 || columns <= 0) {
            System.out.println("Error: Rows and columns must be positive integers.");
            return;
        }

        // Create a 2D array
        int[][] matrix = new int[rows][columns];

        // Take user input for the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array to store the elements of the 2D array
        int[] array = new int[rows * columns];
        int index = 0;

        // Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display the 1D array
        System.out.print("1D Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}