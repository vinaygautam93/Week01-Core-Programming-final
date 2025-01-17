import java.util.Scanner;

public class StringEqual { 
   
    // Method to check if two strings are equal using charAt() method.
    // Compares each character of both strings one by one.
    public boolean charAtMethod(String s1, String s2) {
        // Get lengths of both strings
        int len1 = s1.length();
        int len2 = s2.length();
        
        // If lengths are not equal, strings can't be equal
        if (len1 != len2) {
            return false;
        } else {
            // Compare each character in both strings
            for (int i = 0; i < len1; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false; // Return false if any character doesn't match
                }
            }
            return true; // Strings are equal
        }
    }
    
    // Method to check if two strings are equal using equals() method
    // Directly leverages the built-in String.equals() function
    public boolean isEquals(String s1, String s2) {
        if (s1.equals(s2)) {
            return true; // Strings are equal
        } else {
            return false; // Strings are not equal
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a scanner object to take input
        
        // Take two string inputs from the user
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        
        // Create an object of the StringEqual class
        StringEqual obj = new StringEqual();
        
        // Check string equality using charAtMethod and print the result
        boolean result = obj.charAtMethod(s1, s2);
        System.out.println(result);
        
        // Check string equality using isEquals method and print the result
        boolean result2 = obj.isEquals(s1, s2);
        System.out.println(result2);
    }
}
	