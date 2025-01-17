import java.util.Scanner;

public class SubStringEqual { 
    
    // Method to manually extract a substring using charAt and a loop
    public String charAtSubString(String s1, int start, int end) {
        String ans = ""; // Initialize an empty string to store the result
        for (int i = start; i <= end; i++) { // Loop from the start index to the end index (inclusive)
            ans += s1.charAt(i); // Append each character to the result string
        }
        return ans; // Return the manually constructed substring
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Read the input string
        String s1 = input.nextLine();
        
        // Read the starting and ending indices for the substring
		System.out.println("enter start number " );
        int start = input.nextInt();
		System.out.println("enter last number " );
        int end = input.nextInt();
        
        SubStringEqual obj = new SubStringEqual();
        
        // Manually create a substring using the custom method
        String result = obj.charAtSubString(s1, start, end);
        System.out.println(result); // Print the manually created substring
        
        // Use the built in substring method for comparison
        String result2 = s1.substring(start, end + 1);
        System.out.println(result2); // Print the built-in substring
        
        // Compare the two substrings for equality
        if (result.equals(result2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
        
       
    }
}
