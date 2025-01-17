import java.util.Scanner;

public class PalindromeStringCheck  {
    
	// Instance method for check the string is Paindrome 
	public boolean isPaindrome( String s ) {
	    // Find the length of String 
		int n = s.length();
		
		// Use two pointer approch for check the string is Paindrome 
		// First point 
		int first = 0;
		//Last pointer
		int last = n-1;
		
		// Calculating string is Paindrome 
		while( first < last ) {
		    if(s.charAt(first) != s.charAt(last) ) {
			   // Return string is not Paindrome
			   return false;
			}   
			first++;
			last--;
        }
		// Return string is Paindrome 
        return true;
    }		
	
    
    public static void main ( String []args ) {
	   
	   Scanner input = new Scanner( System.in ); 
	   
	   // Take  a input String 
	   String s = input.nextLine();
	    
	   // Find the length of String 
	   int n = s.length();
	   
	   // Create a instance of PalindromeStringCheck class
	   PalindromeStringCheck obj = new PalindromeStringCheck();
	   
	   //Call the isPaindrome method for check the string is Paindrome 
	   boolean result = obj.isPaindrome(s);
	  
	   // Printing the String is Paindrome
	   System.out.println( " String is Paindrome " + result );
	   
	}
}	