package com.eop.arrays;

import java.lang.reflect.Array;

public class PlusOne {
	
	/**
	 * 1. Add to the last digits first
	 * 2. iterate from back to front and find element == 10
	 * 3. assign element to 0 and plus the carry over to the previous element
	 * @param digits
	 * @return
	 */
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        digits[l-1] ++;
        
        for (int i = l-1; i > 0 && digits[i] == 10; i--){
        	digits[i] = 0;
        	digits[i-1] ++;
        }
        
        //check if front element is 10
        if (digits[0] == 10){
        	digits[0] = 0;
        	int[] newDigits = new int[l+1];
        	newDigits[0] = 1;
        	System.arraycopy(digits, 0, newDigits, 1, l);
        	return newDigits;
        }
        
        return digits;
    }

}
