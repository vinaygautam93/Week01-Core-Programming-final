import java.util.Scanner;
import java.util.Random;

public class StudentScorecard {

    // Method to generate random scores for Physics, Chemistry, and Math
    public int[][] generateScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3]; // 3 subjects: PCM
        Random random = new Random();

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = 50 + random.nextInt(51); // Physics
            scores[i][1] = 50 + random.nextInt(51); // Chemistry
            scores[i][2] = 50 + random.nextInt(51); // Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public double[][] calculateResults(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3]; // Total, Average, Percentage

        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimals
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimals
        }
        return results;
    }

    // Method to display the scorecard in a tabular format
    public void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("S.No\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t\t" +
                scores[i][2] + "\t" +
                (int) results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2]
            );
        }
    }

    // Constructor to run the program
    public StudentScorecard() {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate scores
        int[][] scores = generateScores(numberOfStudents);

        // Calculate results
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScorecard(scores, results);

        // Close the scanner
        scanner.close();
    }

    // Run the program
    public static void main(String[] args) {
        new StudentScorecard();
    }
}