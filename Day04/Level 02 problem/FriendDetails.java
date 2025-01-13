import java.util.Scanner;

public class FriendDetails {

    // Method to find the youngest of the 3 friends
    public static String findYoungest(int[] ages) {
        int youngestAge = ages[0];
        String youngestFriend = "Amar"; // Assuming Amar is first friend initially

        // Compare the ages and find the youngest friend
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = (i == 1) ? "Akbar" : "Anthony";
            }
        }
        return youngestFriend;
    }

    // Method to find the tallest of the 3 friends
    public static String findTallest(int[] heights) {
        int tallestHeight = heights[0];
        String tallestFriend = "Amar"; // Assuming Amar is tallest initially

        // Compare the heights and find the tallest friend
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = (i == 1) ? "Akbar" : "Anthony";
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store ages and heights
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Take user input for ages and heights of Amar, Akbar, and Anthony
        for (int i = 0; i < 3; i++) {
            ages[i] = scanner.nextInt();
            heights[i] = scanner.nextInt();
        }

        // Find and display the youngest and tallest friends
        System.out.println("Youngest Friend: " + findYoungest(ages));
        System.out.println("Tallest Friend: " + findTallest(heights));
    }
}
