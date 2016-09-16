import java.util.HashMap;
import java.util.InputMismatchException;
public class MyBasket {
	/**
	 * This method calculates and returns the total cost of the basket.
	 * @param basket
	 * @return total
	 */
	public static int calculateTotalPrice(BasketItems basket){
		int total = 0;
		HashMap<String, Integer> prices= ItemPrice.prices;
		total = (basket.getNoOfBananas()*prices.get("Banana"))+(basket.getNoOfOranges()*prices.get("Orange"))+(basket.getNoOfApples()*prices.get("Apple"))+(basket.getNoOfLemons()*prices.get("Lemon"))+(basket.getNoOfPeaches()*prices.get("Peaches"));
		if(total<0)				
			total=0;
		return total;
	}
	
}
