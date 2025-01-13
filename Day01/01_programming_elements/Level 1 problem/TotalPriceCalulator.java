import java.util.*;
public class TotalPriceCalulator{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		//Enter the unit price of the item 
		int unitPrice = input.nextInt();
		//Enter quantity to be bought 
		int quantityToBeBought = input.nextInt();
		//Calculating the total price
		int totalPrice = unitPrice*quantityToBeBought;
		System.out.println("The total purchase price is INR : " + totalPrice + ", if the quantity is " + quantityToBeBought + ", and unit price is INR " + unitPrice );
	}
}