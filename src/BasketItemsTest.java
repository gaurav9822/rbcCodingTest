import static org.junit.Assert.*;

import org.junit.Test;
public class BasketItemsTest {

	/**
	 * Test method for {@link MyBasket#calculateTotalPrice(BasketItems)}.
	 */
	@Test
	public final void testCalculateTotalPrice() {
		ItemPrice.initializePrices();						//To init fruit:price hashmap
		
		//Test#1:-All positive integers
		BasketItems basket = new BasketItems(2, 2, 2, 2, 2);
		int actual = MyBasket.calculateTotalPrice(basket);
		assertEquals(150, actual);
		
		//Test#2:-All zeros
		BasketItems basket2 = new BasketItems(0, 0, 0, 0,0);
		actual = MyBasket.calculateTotalPrice(basket2);
		assertEquals(0, actual);		
		
		//Test#3:-All negative		
		BasketItems basket3 = new BasketItems(-1, -1, -1, -1,-1);
		actual = MyBasket.calculateTotalPrice(basket3);
		assertEquals(0, actual);
		
		//Test#4:-Some positives and some negatives		
		BasketItems basket4 = new BasketItems(2, 3, -1, -1,-1);
		actual = MyBasket.calculateTotalPrice(basket4);
		assertEquals(65, actual);
		
		//Test#5:-Some positives and some zeros		
		BasketItems basket5 = new BasketItems(0, 0, 7, 0,4);
		actual = MyBasket.calculateTotalPrice(basket5);
		assertEquals(240, actual);
		
		//Test#6:-Some zeros and some negatives		
		BasketItems basket6 = new BasketItems(0, 0, -7, 0,-4);
		actual = MyBasket.calculateTotalPrice(basket6);
		assertEquals(0, actual);
		
		
		//Test#7:-Big integer value		
		BasketItems basket7 = new BasketItems(214748364, 0, -7, 0,-4);
		actual = MyBasket.calculateTotalPrice(basket7);
		assertEquals(2147483640, actual);
		
		
		//Test#8:-Big negative integer value
		BasketItems basket8 = new BasketItems(-2147483648, 0, -7, 0,-4);
		actual = MyBasket.calculateTotalPrice(basket8);
		assertEquals(0, actual);
		
		//Test#9:-No input test case		
		BasketItems basket9 = new BasketItems();
		actual = MyBasket.calculateTotalPrice(basket9);
		assertEquals(0, actual);
		
		
		
	}

}
