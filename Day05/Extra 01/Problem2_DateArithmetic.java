import java.time.LocalDate;
import java.util.Scanner;

public class Problem2_DateArithmetic {
    public static void main(String[] args) {
        System.out.println("Problem 2: Date Arithmetic");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(inputDate); // Parse input date

        // Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("Date after adding 7 days, 1 month, and 2 years: " + modifiedDate);

        // Subtract 3 weeks
        LocalDate finalDate = modifiedDate.minusWeeks(3);
        System.out.println("Date after subtracting 3 weeks: " + finalDate);
    }
}
