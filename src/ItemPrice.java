import java.util.HashMap;


public class ItemPrice {

	public static HashMap<String, Integer> prices = new HashMap<String,Integer>();
	
	/**
	 * This method initializes the prices of basket items.
	 */
	public static void initializePrices(){
		prices.put("Banana", 10);
		prices.put("Orange",15 );
		prices.put("Apple", 20);
		prices.put("Lemon", 5);
		prices.put("Peaches", 25);
	}
}
