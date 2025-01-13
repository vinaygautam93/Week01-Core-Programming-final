import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input year
        int year = scanner.nextInt();
        
        // Check if the year is greater than or equal to 1582
        if (year < 1582) {
            System.out.println("The year should be greater than or equal to 1582.");
        } else {
            // Check if the year is divisible by 4 and not divisible by 100 unless divisible by 400
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}
