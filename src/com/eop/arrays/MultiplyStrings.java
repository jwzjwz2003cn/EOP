package com.eop.arrays;

public class MultiplyStrings {
	
	/**
	 * 1. determine +\-
	 * 2. multiply using two for loops
	 * 3. convert to string.
	 * 
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */

    public String multiply(String num1, String num2) {
    	
    	int[] results = new int[num1.length() + num2.length()];
    	boolean isPositive = true;
    	if (num1.startsWith("-")){
    		isPositive = false;
    		num1 = num1.substring(1);
    	}
    	if (num2.startsWith("-")){
    		isPositive = !isPositive;
    		num2 = num2.substring(1);
    	}
    	
    	num1 = new StringBuilder(num1).reverse().toString();
    	num2 = new StringBuilder(num2).reverse().toString();
    	
    	for (int i = 0; i < num1.length(); i++){
    		for (int j= 0; j < num2.length(); j++){
    			int d1 = Character.getNumericValue(num1.charAt(i));
    			int d2 = Character.getNumericValue(num2.charAt(j));
    			int result = d1 * d2;
    			results[i+j] += (result % 10);
    			results[i+j+1] += (result/10);
    			results[i+j] %= 10;
    		}
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < results.length; i++){
    		sb.append(String.valueOf(results[i]));
    	}
    	String retVal = sb.reverse().toString();
    	if (retVal.startsWith("0")){
    		for (int i = 0; i < retVal.length(); i++){
    			if (retVal.charAt(i) != '0'){
    				retVal = retVal.substring(i);
    				break;
    			}
    		}
    	}
    	

    	if (!isPositive)
    		retVal = "-" + retVal;
    	
    	return retVal;
        
    }
}
