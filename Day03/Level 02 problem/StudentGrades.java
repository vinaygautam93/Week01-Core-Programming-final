import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of students
        int n = sc.nextInt();

        // Arrays to store marks, percentages, and grades
        double[][] marks = new double[n][3]; // Stores marks for physics, chemistry, maths
        double[] percentages = new double[n]; // Stores percentage of each student
        char[] grades = new char[n]; // Stores grades of each student

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            double physics, chemistry, maths;

            // Get valid marks for physics
            do {
                physics = sc.nextDouble();
            } while (physics < 0 || physics > 100);

            // Get valid marks for chemistry
            do {
                chemistry = sc.nextDouble();
            } while (chemistry < 0 || chemistry > 100);

            // Get valid marks for maths
            do {
                maths = sc.nextDouble();
            } while (maths < 0 || maths > 100);

            // Store marks
            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;
        }

        // Calculate percentages and grades
        for (int i = 0; i < n; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3; // Calculate percentage

            // Determine grade based on percentage
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

        // Display marks, percentages, and grades for each student
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0] + " " + marks[i][1] + " " + marks[i][2] + " " + percentages[i] + " " + grades[i]);
        }
    }
}
