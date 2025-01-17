import java.util.Scanner;

public class ReverseTheString  {
    
	// Instance method for reverse the string
	public String reverseStr( String s ) {
	    // Find the length of String 
		int n = s.length();
		
		// to store reverse String
		String rev = "";
		
		// Calculating reverse String
		for( int i=n-1;i>=0;i--) {
		   
		   rev += s.charAt(i);
		   
        }
        
		// Return the reverse string
        return rev;
    }		
	
    
    public static void main ( String []args ) {
	   
	   Scanner input = new Scanner( System.in ); 
	   
	   // Take  a input String 
	   String s = input.nextLine();
	    
	   // Find the length of String 
	   int n = s.length();
	   
	   // Create a instance of ReverseTheString class
	   ReverseTheString obj = new ReverseTheString();
	   
	   //Call the reverseStr method for reverse the string
	   String result = obj.reverseStr(s);
	  
	   // Printing the reverse String
	   System.out.println( " The Reverse String is " + result );
	   
	}
}	