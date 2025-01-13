import java.util.*;
public class FeetToYardsMilesConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		//take distanceInFeet
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Convert yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        System.out.println(
            "The distance in yards is " + distanceInYards + 
            " and in miles is " + distanceInMiles
        );
    }
}