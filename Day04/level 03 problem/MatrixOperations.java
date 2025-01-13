import java.util.Random;

public class MatrixOperations {

    // Method to create a random matrix with given rows and columns
    public int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random numbers 0-9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int commonDim = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < commonDim; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to transpose a matrix
    public int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Display a matrix
    public void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    // Run the program
    public static void main(String[] args) {
        MatrixOperations operations = new MatrixOperations();

        // Creating random matrices
        int[][] matrix1 = operations.createRandomMatrix(3, 3);
        int[][] matrix2 = operations.createRandomMatrix(3, 3);

        // Display matrices
        System.out.println("Matrix 1:");
        operations.displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        operations.displayMatrix(matrix2);

        // Addition
        System.out.println("Addition of Matrices:");
        operations.displayMatrix(operations.addMatrices(matrix1, matrix2));

        // Subtraction
        System.out.println("Subtraction of Matrices:");
        operations.displayMatrix(operations.subtractMatrices(matrix1, matrix2));

        // Multiplication
        System.out.println("Multiplication of Matrices:");
        operations.displayMatrix(operations.multiplyMatrices(matrix1, matrix2));

        // Transpose
        System.out.println("Transpose of Matrix 1:");
        operations.displayMatrix(operations.transposeMatrix(matrix1));
    }
}