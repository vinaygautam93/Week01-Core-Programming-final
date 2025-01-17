import java.util.Scanner;

public class CountVowelsAndConsonants {
    
	// Instance method for find total vowels
	public int countVowels( String s ) {
	    // Find the length of String 
		int n = s.length();
		
		// To store the count
		int count = 0;
		
		// Fing or Calculating the total vowels
		for( int i=0;i<n;i++) {
		   
		   // If s.charAt(i) is a,e,i,o,u or A,E,I,O,U so it is a vowels
		   if( s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
		      count++;
		   }
        }
        
		// Return the count
        return count;
    }		
	
    
    public static void main ( String []args ) {
	   
	   Scanner input = new Scanner( System.in ); 
	   
	   // Take  a input String 
	   String s = input.nextLine();
	   
	   // Find the length of String 
	   int n = s.length();
	   
	   // Create a instance of CountVowelsAndConsonants class
	   CountVowelsAndConsonants obj = new CountVowelsAndConsonants();
	   
	   //Call the totalConsonants method for finding the total vowels
	   int totalVowels = obj.countVowels(s);
	   
	   // If total vowels find so find total consonant 
	   int totalConsonants = Math.abs(n - totalVowels);
	   
	   // Printing  total vowels
	   System.out.println( " Total Vowels is " + totalVowels );
	   // Printing total consonant
	   System.out.println( " Total Consonants is " + totalConsonants );
	   
	}
}	