import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
	    
	    //double array named heights of size 11
        double[] heights = new double[11];
		
		// Taking user input 
		for( int i=0; i < 11 ; i++) {
		    heights[i] = input.nextDouble();
		}
		// Calculate the total sum using a loop 
		double total=0.0;
        for (int i = 0; i < 11; i++) {
            total += heights[i];
        }
		
		//The formula to calculate the mean is: mean = sum of all elements / number of elements
        System.out.println(" mean " + (double)total/(double)11);
		

    }
}