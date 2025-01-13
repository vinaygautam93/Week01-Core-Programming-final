
import java.util.Random;
import java.util.Scanner;

public class FootballTeam {

    public int generateRandomHeight() {
        Random rand = new Random();
        return rand.nextInt(101) + 150; // Random number between 150 and 250
    }

    public int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public double findMean(int sum, int length) {
        return (double) sum / length;
    }

    public int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FootballTeam team = new FootballTeam();

        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        int[] heights = new int[numPlayers];

        for (int i = 0; i < numPlayers; i++) {
            heights[i] = team.generateRandomHeight();
        }

        int sum = team.findSum(heights);
        double mean = team.findMean(sum, heights.length);
        int shortest = team.findShortest(heights);
        int tallest = team.findTallest(heights);

        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);

        scanner.close();
    }
}
