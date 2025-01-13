import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get salary and years of service from the user
        double salary = scanner.nextDouble();
        int yearsOfService = scanner.nextInt();

        // Check if the employee is eligible for a bonus
        if (yearsOfService > 5) {
            // Calculate the bonus (5% of salary)
            double bonus = salary * 0.05;
            System.out.println("Bonus: " + bonus);
        } else {
            // Output if the employee is not eligible for a bonus
            System.out.println("No bonus");
        }
    }
}
