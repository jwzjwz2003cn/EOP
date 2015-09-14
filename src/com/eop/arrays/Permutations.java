package com.eop.arrays;
import java.util.Arrays;

public class Permutations {
	
	/**
	 * 
	 * 1. perm being the permutation array where perm[i] is the ith element in nums in permutation
	 * 2. get the new array after applying permutation 
	 * 3. do it in place.
	 * 4. permutations are a series of cyclic permutations
	 * 5. detect each cycle
	 */
	
    public void applyPermutation(int[] perm, int[] nums) {
    	
    	for (int i = 0; i < nums.length; i++){
    		
			if (perm[i] >= 0) {
	    		int a = i;
	    		int temp = nums[a];
	    		do {
		       		int a_next = perm[a];
		       		int temp_next = nums[a_next];
		       		nums[a_next] = temp;
		       		perm[a] -= perm.length;
		       		System.out.println(Arrays.toString(nums));
		       		temp = temp_next;
		       		a = a_next;
	    		} while (a != i);
			}
			

    	}
    	
    	StringBuffer sb = new StringBuffer();
    	for (int i = 0; i < perm.length; i++){
    		perm[i] += perm.length;
    		sb.append(nums[i]);
    	}
    	System.out.println(sb.toString());
    }
    
    
    /**
     * 1. find largest descending suffix
     * 2. find the number just before the suffix
     * 3. swapping it with the smallest number that's larger than it in the suffix
     * 4. resort the new suffix from small to large
     * @param nums
     */
    public void nextPermutation(int[] nums) {
        
    	int s1 = 0;
    	for (int i = nums.length-1; nums[i] <= nums[i-1] && i > 0; i--){
    		s1 = i;
    	}
    	s1-=1;
    	if (s1 != 0){
    		int s2 = s1-1;
    		int c = s1;
    		while (nums[c] > nums[s2] && c < nums.length - 1){
    			c += 1;
    		}
    		c = nums.length - 1;
    		int temp = nums[c];
    		nums[c] = nums[s2];
    		nums[s2] = temp;
    	}
    	
    	int head = s1;
    	int tail = nums.length-1;
    	
    	while (head >= tail){
    		int temp = nums[head];
    		nums[head] = nums[tail];
    		nums[tail] = temp;
    		head+=1;
    		tail-=1;
    	}	
    	System.out.println(Arrays.toString(nums));
    }
}
