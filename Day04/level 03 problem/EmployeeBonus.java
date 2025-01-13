import java.util.Random;

public class EmployeeBonus {

    // Method to generate random salaries and years of service for 10 employees
    public double[][] generateEmployeeData() {
        Random random = new Random();
        double[][] data = new double[10][2]; // [salary, years of service]

        for (int i = 0; i < 10; i++) {
            double salary = 10000 + random.nextInt(90000); // Random 5-digit salary
            double yearsOfService = 1 + random.nextInt(10); // Random years of service (1-10)
            data[i][0] = salary;
            data[i][1] = yearsOfService;
        }
        return data;
    }

    // Method to calculate new salary and bonus for each employee
    public double[][] calculateBonus(double[][] data) {
        double[][] result = new double[10][3]; // [old salary, bonus amount, new salary]

        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double yearsOfService = data[i][1];
            double bonus;

            if (yearsOfService > 5) {
                bonus = 0.05 * salary; // 5% bonus
            } else {
                bonus = 0.02 * salary; // 2% bonus
            }

            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

    // Method to calculate totals and display results in a tabular format
    public void displayResults(double[][] data, double[][] result) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-15s %-15s %-15s%n", "Emp No.", "Old Salary", "Bonus Amount", "New Salary");
        for (int i = 0; i < 10; i++) {
            totalOldSalary += result[i][0];
            totalBonus += result[i][1];
            totalNewSalary += result[i][2];

            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f%n", (i + 1), result[i][0], result[i][1], result[i][2]);
        }

        // Displaying totals
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Amount: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    // Main method for execution
    public static void main(String[] args) {
        EmployeeBonus bonusCalculator = new EmployeeBonus();

        // Generating employee data
        double[][] employeeData = bonusCalculator.generateEmployeeData();

        // Calculating bonus and new salaries
        double[][] bonusData = bonusCalculator.calculateBonus(employeeData);

        // Displaying results
        bonusCalculator.displayResults(employeeData, bonusData);
    }
}