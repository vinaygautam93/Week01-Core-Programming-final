import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Take input for a number of persons
        int n = sc.nextInt();

        // Step b: Create arrays to store weight, height, BMI, and weight status
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        // Step c: Take input for the weight and height of the persons
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextDouble();
            heights[i] = sc.nextDouble();
        }

        // Step d: Calculate BMI and find weight status
        for (int i = 0; i < n; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]); // BMI calculation
            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Step e: Display height, weight, BMI, and weight status of each person
        for (int i = 0; i < n; i++) {
            System.out.println(heights[i] + " " + weights[i] + " " + bmis[i] + " " + statuses[i]);
        }
    }
}
