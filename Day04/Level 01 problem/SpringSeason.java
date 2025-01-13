import java.util.Scanner;

public class SpringSeason {
    
    // Method to find Spring Season
    public boolean findSpringSeason(int month , int day) {
        // Find  Spring Season
		// Spring Season is from March 20 to June 20
        if(  month >= 3 & month <=6 )  {
		   if( (month == 3 || month == 6) && (day < 20 && day >= 1 )  ) {
		      return false;
			}  
		   else {
		   return true; 
		   }
		}
        else {
           return false;
        }
		
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for month and day 
        int month = sc.nextInt();
		int day   = sc.nextInt();
		
        // Create an instance of SpringSeason  class
        SpringSeason obj = new SpringSeason();

        // Call method to find Spring Season
        boolean  result = obj.findSpringSeason( month , day );

        // Print the result
        System.out.println(result);
    }
}