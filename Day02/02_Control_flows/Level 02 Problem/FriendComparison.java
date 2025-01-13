import java.util.Scanner;

public class FriendComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for ages and heights
        int ageAmar = scanner.nextInt();
        int ageAkbar = scanner.nextInt();
        int ageAnthony = scanner.nextInt();

        double heightAmar = scanner.nextDouble();
        double heightAkbar = scanner.nextDouble();
        double heightAnthony = scanner.nextDouble();

        // Finding the youngest friend
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        if (youngestAge == ageAmar) {
            System.out.println("Amar is the youngest.");
        } else if (youngestAge == ageAkbar) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        // Finding the tallest friend
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        if (tallestHeight == heightAmar) {
            System.out.println("Amar is the tallest.");
        } else if (tallestHeight == heightAkbar) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }
    }
}
