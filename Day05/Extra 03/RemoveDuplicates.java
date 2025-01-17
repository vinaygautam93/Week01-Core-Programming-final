import java.util.Scanner;

public class RemoveDuplicates  {
    
	// Instance method for Remove Duplicates from a String
	public String duplicates( String s ) {
	    // Find the length of String 
		int n = s.length();
		
		String ans = "";
		
		// Remove or find Duplicates from a String
		for( int i=0; i<n; i++) {
			boolean flag = false;
		    for( int j=0;j<n;j++) {
			    if( i != j && s.charAt(i) == s.charAt(j) ) { 
				   flag = true;
				   break;
				}
			}
            if( flag == false ) { 
			   ans += s.charAt(i);
			}   
		}	   
               							   
		// Return final string 
        return ans;
    }		
	
    
    public static void main ( String []args ) {
	   
	   Scanner input = new Scanner( System.in ); 
	   
	   // Take  a input String 
	   String s = input.nextLine();
	   
	   // Find the length of String 
	   int n = s.length();
	   
	   // Create a instance of RemoveDuplicates class
	   RemoveDuplicates obj = new RemoveDuplicates();
	   
	   //Call the duplicates method for Remove Duplicates from a String
	   String result = obj.duplicates(s);
	  
	   // Printing the final String 
	   System.out.println( " Final String is  " + result );
	   
	}
}	