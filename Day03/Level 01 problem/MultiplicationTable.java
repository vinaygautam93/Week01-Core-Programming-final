import java.util.*;

public class MultiplicationTable {
       public static void main( String []args) {
	        
			Scanner input = new Scanner(System.in);
			
			// Taking integer input and store it in the number variable
			int number = input.nextInt();
			// Declaring array
			int[] arr  = new  int[10];
			
			// Taking user input 
			
			// Calculating multiplication table of a number
			for(int i=0;i<10;i++) {
			
			// Calculating result
			int result = (number * (i+1));
			//store the results in the multiplication table array
			arr[i] = result;
			
			
		    }
			//display the result from the array
			for(int i=0;i<10;i++) {
			
			//displaying the result in fome of array
			System.out.println(number + " * "  + (i+1) + " = " + arr[i] );
			
			}	
		   
    }
}	
