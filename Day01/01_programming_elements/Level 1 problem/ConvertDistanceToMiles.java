import java.util.Scanner;
public class ConvertDistanceToMiles  {
    public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);
		
		// take user input of kilometer
		double km = input.nextDouble();
		
		// Conversion
        double kmToMilesConversion = km * 1.6;
        
        // Displaying results 
        System.out.println( " The total miles is " + kmToMilesConversion + " mile for the given " + km + " km "  );
   
   }
}