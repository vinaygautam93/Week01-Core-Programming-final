public class UniversityFee  {
    public static void main(String[] args) {
         
		//University total fee
        int fee = 125000;
		//University is willing to offer a discount of 10%
		int discountPercent =10;
		
        
		//Calculating discount and discounted price
        double discount = (double)( fee * discountPercent ) / (double)100;
        double discountedPrice = (double)fee - discount;

        // Displaying discount 
        System.out.println( " The discount amount is INR " + discount + " and final discounted fee is INR " + discountedPrice  );
    }
}