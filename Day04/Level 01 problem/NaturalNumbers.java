import java.util.Scanner;

public class NaturalNumbers {
    
    // Method to find sum of n natural numbers
    public int printNaturalNumbers(int n) {
	    // Initially sum is zero
	    int sum = 0;
        // Find sum of n natural numbers 
		// loop 1 to n because it is all natural number
        for(int i=1;i<=n;i++) {
		  sum+=i;
		}

        return sum;		
		
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for n 
        int n = sc.nextInt();

        // Create an instance of NaturalNumbers  class
        NaturalNumbers obj = new NaturalNumbers();

        // Call method to find sum of n natural numbers
        int sum = obj.printNaturalNumbers(n);

        // Print the sum
        System.out.println(sum);
    }
}