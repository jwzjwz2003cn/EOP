package com.eop.arrays;

public class JumpGame {
	
	/**
	 * find the max(max, i + nums[i])
	 * 
	 * @param nums
	 * @return
	 */
	
    public boolean canJump(int[] nums) {
    	
    	//start with 0
    	int maxReach = 0;
    	
    	//condition to limit i < maxReach
    	for (int i = 0; i <= maxReach && maxReach < nums.length; i++){
    		maxReach = Math.max(maxReach, nums[i] + i);
    	}
    	
    	return maxReach >= nums.length - 1;
        
    }

}
