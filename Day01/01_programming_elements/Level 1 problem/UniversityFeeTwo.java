import java.util.Scanner;
public class UniversityFeeTwo  {
    public static void main(String[] args) {
         
		Scanner input = new Scanner(System.in);
		//University total fee (user input)
        int fee = input.nextInt();
		
		//University is willing to offer a discount of % (user input) 
		int discountPercent =input.nextInt();
		
        
		//Calculating discount and discounted price
        double discount = (double)( fee * discountPercent ) / (double)100;
        double discountedPrice = (double)fee - discount;

        // Displaying discount 
        System.out.println( " The discount amount is INR " + discount + " and final discounted fee is INR " + discountedPrice  );
    }
}