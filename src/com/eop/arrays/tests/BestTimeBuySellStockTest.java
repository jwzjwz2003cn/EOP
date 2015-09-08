package com.eop.arrays.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.eop.arrays.BestTimeBuySellStock;

public class BestTimeBuySellStockTest {
	
	@Test
	public void test(){
		
		BestTimeBuySellStock btbss = new BestTimeBuySellStock();
		
		int[] prices = {310, 315, 275, 295, 260, 270, 290, 230, 255, 250};
		
		int[] prices2 = {3, 2, 6, 5, 0, 3};
		
		assertEquals("max profit is 7", 7, btbss.maxProfit(2, prices2));
		
		assertEquals("max profit is 30", 30, btbss.maxProfit(prices));
	
	}

}
