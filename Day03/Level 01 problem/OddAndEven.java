import java.util.*;

public class OddAndEven {
       public static void main( String []args) {
	        
			Scanner input = new Scanner(System.in);
			// Declaring array
			int[] arr  = new  int[5];
			
			// Taking user input 
			for( int i=0; i < 5 ; i++) {
			arr[i] = input.nextInt();
			}
			
			// finding negative, even or odd, zero
			for(int i=0;i<5;i++) {
			if( arr[i] < 0 ) {
			System.out.println(arr[i] + " negative");
			}
			else if( arr[i] > 0 ) {
			// If arr[i] % 2 == 0 is true so it's even
			if( arr[i] % 2 == 0 ) {
			System.out.println(arr[i] + " even");
			}
			// If arr[i] % 2 != 0 is false so it's odd
			else {
			System.out.println(arr[i] + " odd");
			}
			}
			else if ( arr[i] == 0) {
			System.out.println(arr[i] + " zero");
			}
		}
    }
}	