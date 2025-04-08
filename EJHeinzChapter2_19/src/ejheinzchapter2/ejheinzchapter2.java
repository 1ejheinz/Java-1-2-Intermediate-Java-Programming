package ejheinzchapter2;

   /**
      @author EJ Heinz
      The main method is the program's starting point.
   */
public class ejheinzchapter2 {
	public static void main(String[] args) {
		/*
		 * 19. Stock Transaction Program Last month Joe purchased some stock in Acme
		 * Software, Inc. Here are the details of the purchase:
		 * 
		 * The number of shares that Joe purchased was 1,000.
		 * 
		 * When Joe purchased the stock, he paid $32.87 per share.
		 * 
		 * Joe paid his stockbroker a commission that amounted to 2% of the amount he
		 * paid for the stock.
		 * 
		 * Two weeks later Joe sold the stock. Here are the details of the sale:
		 * 
		 * The number of shares that Joe sold was 1,000.
		 * 
		 * He sold the stock for $33.92 per share.
		 * 
		 * He paid his stockbroker another commission that amounted to 2% of the amount
		 * he received for the stock.
		 * 
		 * Write a program that displays the following information:
		 * 
		 * The amount of money Joe paid for the stock.
		 * 
		 * The amount of commission Joe paid his broker when he bought the stock.
		 * 
		 * The amount that Joe sold the stock for.
		 * 
		 * The amount of commission Joe paid his broker when he sold the stock.
		 * 
		 * Display the amount of profit that Joe made after selling his stock and paying
		 * the two commissions to his broker. (If the amount of profit that your program
		 * displays is a negative number, then Joe lost money on the transaction.)
		 */
		// declarations
		int PurchasedStocks = 1000;
		double PurchasedPrice, SalePrice, CommissionRate;
		PurchasedPrice = 32.87;
		SalePrice = 33.92;
		CommissionRate = 0.02;

		// buy and sell calculation
		double PaidForTheStock, CommissionToBroker, PurchacePrice, SoldTheStockFor, AmountOfCommission, Sold;
		PaidForTheStock = PurchasedStocks * PurchasedPrice;
		CommissionToBroker = PaidForTheStock * CommissionRate;
		PurchacePrice = PaidForTheStock + CommissionToBroker;
		SoldTheStockFor = PurchasedStocks * SalePrice;
		AmountOfCommission = SoldTheStockFor * CommissionRate;
		Sold = SoldTheStockFor - AmountOfCommission;
		System.out.println("Joe paid $" + PaidForTheStock + " for a " + PurchasedStocks + " stocks.");
		System.out.println("Joe paid $" + CommissionToBroker + " commission for the stocks.");
		System.out.println("Joe sold the " + PurchasedStocks + " stocks for $" + SoldTheStockFor + ".");
		System.out.println(
				"Joe paid $" + AmountOfCommission + " commission to his broker for the sale.");

		// profit calculation
		double grandTotal = Sold - PurchacePrice;
		grandTotal = (int) grandTotal;
		System.out.println("Joe's total profit came to $" + grandTotal + ".");
	}
}
