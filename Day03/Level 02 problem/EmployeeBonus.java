import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salaries = new double[10]; // Array to store salaries
        double[] years = new double[10];   // Array to store years of service
        double[] bonuses = new double[10]; // Array to store bonuses
        double[] newSalaries = new double[10]; // Array for new salaries
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Take input for salary and years of service
        for (int i = 0; i < 10; i++) {
            while (true) {
                salaries[i] = sc.nextDouble();
                years[i] = sc.nextDouble();
                if (salaries[i] > 0 && years[i] >= 0) break; // Ensure valid input
            }
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < 10; i++) {
            bonuses[i] = years[i] > 5 ? 0.05 * salaries[i] : 0.02 * salaries[i];
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Output results
        System.out.println(totalBonus);
        System.out.println(totalOldSalary);
        System.out.println(totalNewSalary);
    }
}
