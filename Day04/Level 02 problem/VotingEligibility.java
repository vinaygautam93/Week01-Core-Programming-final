import java.util.Scanner;

public class VotingEligibility {

    // Method to check voting eligibility
    public static boolean canVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the age of 10 students
        for (int i = 0; i < 10; i++) {
            int age = scanner.nextInt();
            if (canVote(age)) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
    }
}
