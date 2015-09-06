package com.eop.arrays;

public class RemoveElement {
	
	/**
	 * 
	 * Use two pointers
	 * 1. p1 ++ every time
	 * 2. p2 ++ only when nums[p1] != val, so val is effectively skipped
	 * 3. return newIndex ++
	 * 
	 * @param nums
	 * @param val
	 * @return
	 */
    public int removeElement(int[] nums, int val) {
    	
    	int newIndex = 0;
    	
    	for (int i = 0; i < nums.length; i++){
    		if (nums[i] != val)
    			nums[newIndex++] = nums[i];
    	}
    	
    	return newIndex;
        
    }

}
