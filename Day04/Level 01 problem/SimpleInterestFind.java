import java.util.Scanner;

public class SimpleInterestFind {
    
    // Method to calculate Simple Interest
    public double calculateTheSimpleInterest(int principal, int rate, int time) {
    // Simple Interest formula: SI = (Principal * Rate * Time) / 100
    double si = (double)principal * rate * time /  (double)100;
    return si;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input values for principal, rate, and time
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        // Create an instance of SimpleInterest class
        SimpleInterestFind obj = new SimpleInterestFind();

        // Call method to calculate Simple Interest
        double result = obj.calculateTheSimpleInterest(principal, rate, time);

        // Print the result
        System.out.println("The Simple Interest is " + result + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}
