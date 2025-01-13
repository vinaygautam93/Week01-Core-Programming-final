import java.util.Scanner;
public class ConvertsIntoFeet  {
    public static void main(String[] args) {
         
	    Scanner input = new Scanner(System.in);
	    // takes your height in centimeters (user input)
        int heightInCentimeters = input.nextInt();
		
	    // converts it into centimeters to inches
		double heightInInches = (double)heightInCentimeters / (double)2.54;
		
	    // converts it into feet
	    
		double heightInFeet = heightInInches / (double)12 ;
		
        // Displaying discount 
        System.out.println( " Your Height in cm is " + heightInCentimeters + " while in feet is " + heightInFeet  + " and inches is " + heightInInches );
    }
}

