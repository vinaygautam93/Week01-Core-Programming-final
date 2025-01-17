import java.util.Random;
import java.util.Scanner;

class StudentScorecard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public int[][] generateScores(int studentsCount) {
        Random random = new Random();
        int[][] scores = new int[studentsCount][3]; // Array to store PCM scores for each student

        for (int i = 0; i < studentsCount; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(91) + 10; // Generate random scores between 10 and 99
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public double[][] calculateResults(int[][] scores) {
        int studentsCount = scores.length;
        double[][] results = new double[studentsCount][3]; // Array to store total, average, and percentage

        for (int i = 0; i < studentsCount; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j]; // Calculate total marks
            }

            double average = total / 3.0; // Calculate average
            double percentage = (total / 300.0) * 100; // Calculate percentage

            // Store rounded values in the results array
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }

        return results;
    }

    // Method to calculate grade based on percentage
    public char[] calculateGrades(double[][] results) {
        int studentsCount = results.length;
        char[] grades = new char[studentsCount]; // Array to store grades

        for (int i = 0; i < studentsCount; i++) {
            double percentage = results[i][2]; // Get percentage

            // Determine grade based on percentage
            if (percentage >= 80) {
                grades[i] = 'A';
            } else if (percentage >= 70) {
                grades[i] = 'B';
            } else if (percentage >= 60) {
                grades[i] = 'C';
            } else if (percentage >= 50) {
                grades[i] = 'D';
            } else if (percentage >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        return grades;
    }

    // Method to display the scorecard in a tabular format
    public void displayScorecard(int[][] scores, double[][] results, char[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.print("S" + (i + 1) + "\t");

            // Print Physics, Chemistry, and Math scores
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t");
            }

            // Print Total, Average, Percentage, and Grade
            System.out.print((int) results[i][0] + "\t"); // Total
            System.out.print(results[i][1] + "\t"); // Average
            System.out.print(results[i][2] + "\t\t"); // Percentage
            System.out.println(grades[i]); // Grade
        }
    }

    // Main method to execute the program
    public void mainMethod() {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of students
        System.out.print("Enter the number of students: ");
        int studentsCount = scanner.nextInt();

        // Generate random PCM scores
        int[][] scores = generateScores(studentsCount);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        // Determine grades based on percentage
        char[] grades = calculateGrades(results);

        // Display the scorecard
        displayScorecard(scores, results, grades);
    }
}
