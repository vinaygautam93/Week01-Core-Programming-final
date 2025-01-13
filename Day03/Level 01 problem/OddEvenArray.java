import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from the user
        int number = input.nextInt();
		
		// Create factors array of size 10
		int[] factorsArray = new int[10];
		int idx = 0;
		
		//Calculating result
		for(int i=1; i < number ; i++) {
			if( number % i == 0 ) {
				if(idx<10) {
				factorsArray[idx]=i;
				}
				idx++;
			}
        }
		
		//Print factors array
		for( int i = 0 ; i < 10 ; i++) {
			System.out.print(" " + factorsArray[i] + " ");
		}	
        		
    }
}
