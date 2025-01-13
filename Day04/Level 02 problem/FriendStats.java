import java.util.Scanner;

public class FriendStats {

    // Method to find the youngest of the three friends
    public static String findYoungest(int[] ages) {
        int youngestAge = ages[0];
        String youngestFriend = "Friend 1";

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = "Friend " + (i + 1);
            }
        }
        return youngestFriend;
    }

    // Method to find the tallest of the three friends
    public static String findTallest(int[] heights) {
        int tallestHeight = heights[0];
        String tallestFriend = "Friend 1";

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = "Friend " + (i + 1);
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for ages and heights of 3 friends
        int[] ages = new int[3];
        int[] heights = new int[3];
        
        for (int i = 0; i < 3; i++) {
            ages[i] = scanner.nextInt();
            heights[i] = scanner.nextInt();
        }

        // Find and display the youngest and tallest friends
        System.out.println("Youngest: " + findYoungest(ages));
        System.out.println("Tallest: " + findTallest(heights));
    }
}
