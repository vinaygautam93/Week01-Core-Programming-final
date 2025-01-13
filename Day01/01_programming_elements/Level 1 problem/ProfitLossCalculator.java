public class ProfitLossCalculator {
    public static void main(String[] args) {
        
        int costPrice = 129;
        int sellingPrice = 191;
        
		////Calculating answer
        int profit = sellingPrice - costPrice;
        double profitPercentage = ((double) profit / costPrice) * 100;

        // Displaying costPrice, sellingPrice, profit, profitPercentage, 
        System.out.println(
            "Cost Price (INR): " + costPrice + "\n" +
            "Selling Price (INR): " + sellingPrice + "\n" +
            "Profit (INR): " + profit + "\n" +
            "Profit Percentage: " + String.format("%.2f", profitPercentage) + "%"
        );
    }
}
