import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        double[][] data = new double[10][3]; // 2D array to store weight, height, and BMI
        Scanner sc = new Scanner(System.in);

        // Collect data and calculate BMI
        for (int i = 0; i < 10; i++) {
            // Human inputs weight and height
            double weight = 0;  // Human inputs weight
            double height = 0;  // Human inputs height
            double height_m = height / 100;  // Convert height to meters
            double bmi = weight / (height_m * height_m);  // Calculate BMI
            data[i][0] = weight;
            data[i][1] = height;
            data[i][2] = bmi;
        }

        // Display results with BMI status
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = data[i][2];
            String status = determineBMIStatus(bmi);
            System.out.printf("Weight: %.2f kg, Height: %.2f cm, BMI: %.2f, Status: %s%n", weight, height, bmi, status);
        }

        sc.close();
    }

    // Method to determine BMI status
    public static String determineBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}