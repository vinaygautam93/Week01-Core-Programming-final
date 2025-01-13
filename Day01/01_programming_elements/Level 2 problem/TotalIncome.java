import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        // Declare variables for salary and bonus
        double salary, bonus;

        // Take user input for salary and bonus
        Scanner scanner = new Scanner(System.in);
        salary = scanner.nextDouble();
        bonus = scanner.nextDouble();

        // Compute total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);

        // Close the scanner
        scanner.close();
    }
}
