import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of students
        int n = sc.nextInt();

        // 2D array to store marks of physics, chemistry, and maths for each student
        double[][] marks = new double[n][3];
        double[] percentages = new double[n]; // Array to store percentages
        char[] grades = new char[n]; // Array to store grades

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                double mark;
                // Input valid marks for each subject
                do {
                    mark = sc.nextDouble();
                } while (mark < 0 || mark > 100);
                marks[i][j] = mark;
            }
        }

        // Calculate percentages and grades
        for (int i = 0; i < n; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3;

            // Assign grades based on percentage
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Display results
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0] + " " + marks[i][1] + " " + marks[i][2] + " " + percentages[i] + " " + grades[i]);
        }
    }
}
