import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        int n = sc.nextInt();

        // Create a 2D array to store height, weight, and BMI
        double[][] personData = new double[n][3]; // [height, weight, BMI]
        String[] weightStatus = new String[n];   // Array for weight status

        // Input weight and height for each person (ensure valid positive values)
        for (int i = 0; i < n; i++) {
            double weight, height;

            // Get valid weight
            do {
                weight = sc.nextDouble();
            } while (weight <= 0);

            // Get valid height
            do {
                height = sc.nextDouble();
            } while (height <= 0);

            personData[i][0] = height; // Store height
            personData[i][1] = weight; // Store weight
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < n; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];

            // Calculate BMI
            personData[i][2] = weight / (height * height);

            // Determine weight status based on BMI
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and weight status for each person
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][0] + " " + personData[i][1] + " " + personData[i][2] + " " + weightStatus[i]);
        }
    }
}
