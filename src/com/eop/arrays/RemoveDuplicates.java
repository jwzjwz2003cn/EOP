package com.eop.arrays;

public class RemoveDuplicates {
	
	/**
	 * similar to remove element
	 * increment newIndex pointer when nums[i] != nums[i-1]
	 * 
	 * @param nums
	 * @return
	 */
    public int removeDuplicates(int[] nums) {
    	
    	int newIndex = 0;
    	
    	if (nums.length == 0)
    		return 0;
    	
    	for (int i = 1; i < nums.length; i++){
    		if (nums[i-1] != nums[i])
    			nums[++newIndex] = nums[i]; //add 1 first before assignment
    	}
    	
    	return newIndex + 1;
        
    }

}
