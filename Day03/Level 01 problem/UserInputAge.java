import java.util.*;

public class UserInputAge {
       public static void main( String []args) {
	        
			Scanner input = new Scanner(System.in);
			// Declaring array
			int[] arr  = new  int[10];
			
			// Taking user input 
			for( int i=0; i < 10 ; i++) {
			arr[i] = input.nextInt();
			}
			
			// Calculating or finding invalid age, can vote, cannot vote
			for(int i=0;i<10;i++) {
			if( arr[i] < 0 ) {
			System.out.println("invalid age");
			}
			else if( arr[i] >= 18 ) {
			System.out.println(arr[i] + " can vote");
			}
			else {
			System.out.println(arr[i] + " cannot vote");
			}
		}
    }
}	
			
			
			