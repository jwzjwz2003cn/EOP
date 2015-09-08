package com.eop.arrays;

public class BestTimeBuySellStock {
	
	
	/**
	 * 1. keep track of minimum price
	 * 2. keep track of maximum profit 
	 * @param prices
	 * @return
	 */
    public int maxProfit(int[] prices) {
    	
    	int minPrice = Integer.MAX_VALUE;
    	int maxProfit = 0;
    	
    	for (int i = 0; i < prices.length; i++){
    		minPrice = Math.min(minPrice, prices[i]);
    		int profit = prices[i] - minPrice;
    		maxProfit = Math.max(profit, maxProfit);
    	}
    	
    	return maxProfit;
        
    }
    
    
    /**
     * 
     * 1. find max profit for first pass using minPrice and maxPrice
     * 2. Do it backward, find max profit using maxPrice and previous maxPrice
     * 
     */
    public int maxProfitTwice(int[] prices) {
    	
    	int minPrice = Integer.MAX_VALUE;
    	int maxProfit = 0;
    	int[] maxProfits = new int[prices.length];
    	
    	//first pass
    	for (int i = 0; i < prices.length; i++){
    		minPrice = Math.min(minPrice, prices[i]);
    		int profit = prices[i] - minPrice;
    		maxProfit = Math.max(profit, maxProfit);
    		maxProfits[i] = maxProfit;
    	}
    	
    	int maxPrice = Integer.MIN_VALUE;
    	// second transaction needs to be happen on the next day of previous sell action
    	for (int i = prices.length - 1; i > 0; i--){
    		
    		maxPrice = Math.max(maxPrice, prices[i]);
    		maxProfit = Math.max(maxProfit, maxPrice - prices[i] + maxProfits[i-1]);
    	}
    	
    	return maxProfit;
        
    }
    
    public int maxProfit(int k, int[] prices) {
    	
    	// this is identical to best time to buy and sell stock 2
    	if (k > prices.length / 2) {
    		int profit = 0;
    		for (int i = 1; i < prices.length; i++){
    			profit = prices[i] > prices[i-1] ? 
    					profit + (prices[i] - prices[i-1]) : profit;
    		}
    		return profit;	
    	}


    	//use DP
    	//use hold and sell to keep track of maximum profit
    	//sell = max(sell, hold[i] + price[j])
    	//buy = max(hold, sell[i-1] - price[j])
    	
    	int[] sold = new int[k+1];
    	int[] bought = new int[k+1];
    	for (int i = 0; i <=k; i++){
    		sold[i] = 0;
    		bought[i] = Integer.MIN_VALUE;
    	}
    	for (int i = 0; i < prices.length; i++){
    		for (int j = 1; j <= k; j++) {	
    			sold[j] = Math.max(sold[j], bought[j] + prices[i]);
    			bought[j] = Math.max(bought[j], sold[j-1] - prices[i]);
    		}
    		
    	}
    	
    	return sold[k];

    }

}
