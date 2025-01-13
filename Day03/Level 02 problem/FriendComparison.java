import java.util.Scanner;

public class FriendComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3]; // Ages of the friends
        double[] heights = new double[3]; // Heights of the friends

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        // Find youngest and tallest friend
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) youngestIndex = i;
            if (heights[i] > heights[tallestIndex]) tallestIndex = i;
        }

        // Display results
        System.out.println(youngestIndex); // Index of youngest
        System.out.println(tallestIndex);  // Index of tallest
    }
}
